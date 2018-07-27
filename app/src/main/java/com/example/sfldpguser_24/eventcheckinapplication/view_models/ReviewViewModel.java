package com.example.sfldpguser_24.eventcheckinapplication.view_models;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.sfldpguser_24.eventcheckinapplication.BR;
import com.example.sfldpguser_24.eventcheckinapplication.activity.IMainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.activity.MainActivity;
import com.example.sfldpguser_24.eventcheckinapplication.models.EventUser;
import com.example.sfldpguser_24.eventcheckinapplication.presenter.IActivityPresenter;

public class ReviewViewModel extends BaseObservable{
    private EventUser eventUser;

    @Bindable
    public EventUser getEventUser() {
        return eventUser;
    }

    public void setEventUser(EventUser eventUser) {
        this.eventUser = eventUser;
        notifyPropertyChanged(BR.eventUser);
    }

    public void onRetakeImage(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.setWelcomeFragment();
    }

    public void onConfirm(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        presenter.setCongratsFragment();
    }
}
