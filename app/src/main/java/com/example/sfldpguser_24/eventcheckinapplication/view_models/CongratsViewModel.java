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

public class CongratsViewModel extends BaseObservable{
    private EventUser eventUser;
    private String photoUrl;

    @Bindable
    public EventUser getEventUser() {
        return eventUser;
    }

    public void setEventUser(EventUser eventUser) {
        this.eventUser = eventUser;
        notifyPropertyChanged(BR.eventUser);
    }

    @Bindable
    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        notifyPropertyChanged(BR.photoUrl);
    }

    public void setCongratsClick(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.setExitFragment();
    }
}
