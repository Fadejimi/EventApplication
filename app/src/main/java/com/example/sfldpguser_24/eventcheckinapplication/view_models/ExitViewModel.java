package com.example.sfldpguser_24.eventcheckinapplication.view_models;

import android.content.Context;
import android.databinding.BaseObservable;

import com.example.sfldpguser_24.eventcheckinapplication.activity.IMainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.activity.MainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.presenter.IActivityPresenter;

public class ExitViewModel extends BaseObservable{

    public void setRegisterClick(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.setWelcomeFragment();
    }

    public void setExitClick(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.finish();
    }
}
