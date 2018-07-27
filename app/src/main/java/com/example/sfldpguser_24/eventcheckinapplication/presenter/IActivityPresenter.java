package com.example.sfldpguser_24.eventcheckinapplication.presenter;

import android.content.Context;

import com.example.sfldpguser_24.eventcheckinapplication.databinding.ActivityMainBinding;
import com.example.sfldpguser_24.eventcheckinapplication.models.EventUser;

public interface IActivityPresenter {
    public void setWelcomeFragment();
    public void setCongratsFragment();
    public void setExitFragment();
    public void setReviewFragment();
    public void setScanIDFragment();
    public void setTakePictureFragment(EventUser eventUser);
    public void setConfirmImageFragment(String photoTag);
    public void setBinding(ActivityMainBinding binding);
    public void finish();
}
