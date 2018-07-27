package com.example.sfldpguser_24.eventcheckinapplication.view_models;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.sfldpguser_24.eventcheckinapplication.BR;
import com.example.sfldpguser_24.eventcheckinapplication.activity.IMainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.activity.MainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.models.EventUser;
import com.example.sfldpguser_24.eventcheckinapplication.presenter.IActivityPresenter;
import com.example.sfldpguser_24.eventcheckinapplication.utils.EventUtil;

public class ScanIdViewModel extends BaseObservable {
    private EventUser eventUser;
    private String photoTag;
    private String buttonText;

    public ScanIdViewModel(EventUser eventUser, String photoTag) {
        this.photoTag = photoTag;
        this.eventUser = eventUser;
    }

    @Bindable
    public EventUser getEventUser() {
        return eventUser;
    }

    public void setEventUser(EventUser eventUser) {
        this.eventUser = eventUser;
        notifyPropertyChanged(BR.eventUser);
    }

    @Bindable
    public String getPhotoTag() {
        return photoTag;
    }

    public void setPhotoTag(String photoTag) {
        this.photoTag = photoTag;
        notifyPropertyChanged(BR.photoTag);
    }

    @Bindable
    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText() {
        this.buttonText = buttonText;
        notifyPropertyChanged(BR.buttonText);
    }

    public void setPictureTake(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.setConfirmImageFragment(photoTag);
    }
}
