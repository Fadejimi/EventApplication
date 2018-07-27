package com.example.sfldpguser_24.eventcheckinapplication.presenter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.example.sfldpguser_24.eventcheckinapplication.R;
import com.example.sfldpguser_24.eventcheckinapplication.activity.IMainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.activity.MainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.databinding.ActivityMainBinding;
import com.example.sfldpguser_24.eventcheckinapplication.models.EventUser;
import com.example.sfldpguser_24.eventcheckinapplication.utils.EventUtil;
import com.example.sfldpguser_24.eventcheckinapplication.views.ConfirmImageFragment;
import com.example.sfldpguser_24.eventcheckinapplication.views.CongratsFragment;
import com.example.sfldpguser_24.eventcheckinapplication.views.ExitFragment;
import com.example.sfldpguser_24.eventcheckinapplication.views.ReviewFragment;
import com.example.sfldpguser_24.eventcheckinapplication.views.ScanIDFragment;
import com.example.sfldpguser_24.eventcheckinapplication.views.WelcomeFragment;

public class ActivityPresenter implements IActivityPresenter {

    private Context mContext;
    private IMainActivity mIMainActivity;
    private ActivityMainBinding mBinding;

    public ActivityPresenter(Context context, ActivityMainBinding binding) {
        this.mContext = context;
        this.mBinding = binding;
    }

    @Override
    public void setWelcomeFragment() {
        Fragment fragment = new WelcomeFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
            .beginTransaction();
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.welcome_fragment));
        transaction.commit();
    }

    @Override
    public void setCongratsFragment() {
        Fragment fragment = new CongratsFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.congrats_fragment));
        transaction.commit();
    }

    @Override
    public void setExitFragment() {
        Fragment fragment = new ExitFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.exit_fragment));
        transaction.commit();
    }

    @Override
    public void setReviewFragment() {
        Fragment fragment = new ReviewFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.review_fragment));
        transaction.commit();
    }

    @Override
    public void setScanIDFragment() {
        Fragment fragment = new ScanIDFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction();
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.scan_id_fragment));
        transaction.commit();
    }

    @Override
    public void setConfirmImageFragment(String photoTag) {
        Fragment fragment = new ConfirmImageFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putString(EventUtil.PHOTO_TAG, photoTag);
        fragment.setArguments(bundle);
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.confirm_image_fragment));
        transaction.commit();
    }

    @Override
    public void setTakePictureFragment(EventUser user) {
        Fragment fragment = new ScanIDFragment();
        FragmentTransaction transaction = ((MainActivity) mContext).getSupportFragmentManager()
                .beginTransaction();
        Bundle bundle = new Bundle();
        bundle.putString(EventUtil.PHOTO_TAG, EventUtil.USER_PHOTO);
        bundle.putString("event_user", user.toJson());
        transaction.replace(R.id.main_container, fragment, mContext.getString(R.string.scan_id_fragment));
        transaction.commit();
    }

    @Override
    public void finish() {
        ((MainActivity) mContext).finish();
    }

    @Override
    public void setBinding(ActivityMainBinding binding) {
        this.mBinding = binding;
    }
}
