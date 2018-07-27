package com.example.sfldpguser_24.eventcheckinapplication.view_models;

import android.content.Context;
import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;

import com.example.sfldpguser_24.eventcheckinapplication.activity.IMainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.activity.MainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.presenter.IActivityPresenter;
import com.example.sfldpguser_24.eventcheckinapplication.utils.EventUtil;

public class WelcomeViewModel extends BaseObservable {
    private static final String TAG = WelcomeViewModel.class.getSimpleName();
    public void checkIn(View view) {
        Log.d(TAG, "checkIn()");
        IMainActivity iMainActivity = (MainActivity) view.getContext();
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.setScanIDFragment();

    }
}
