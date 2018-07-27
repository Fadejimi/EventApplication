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

public class ConfirmImageViewModel extends BaseObservable {
    public String TAG = ConfirmImageViewModel.class.getSimpleName();

    private String photoTag;
    private EventUser eventUser;
    private String userName;
    private String photoUrl;
    private String buttonName;

    public ConfirmImageViewModel(EventUser user, String photoTag) {
        this.photoTag = photoTag;
        setEventUser(user);
    }

    @Bindable
    public EventUser getEventUser() {
        return eventUser;
    }

    @Bindable
    public String getPhotoUrl() {
        return photoUrl;
    }

    @Bindable
    public String getUserName() {
        return userName;
    }

    @Bindable
    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName() {
        if (photoTag.equals(EventUtil.USER_PHOTO)) {
            buttonName = "SCAN ID";
        }
        else {
            buttonName = "TAKE PICTURE";
        }
        notifyPropertyChanged(BR.buttonName);
    }

    public void setEventUser(EventUser eventUser) {
        this.eventUser = eventUser;
        notifyPropertyChanged(BR.eventUser);
    }

    public void setUserName(String userName) {
        this.userName = userName;
        EventUser eventUser = getEventUser();
        eventUser.setUserName(userName);
        setEventUser(eventUser);
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
        EventUser eventUser = getEventUser();
        if (photoTag.equals(EventUtil.USER_PHOTO)) {
            eventUser.setPhotoUrl(photoUrl);
            setEventUser(eventUser);
        }
        else {
            eventUser.setIdUrl(photoUrl);
            setEventUser(eventUser);
        }
    }

    public void confirm(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        if (photoTag.equals(EventUtil.USER_PHOTO)) {
            presenter.setCongratsFragment();
        }
        else {
            presenter.setTakePictureFragment(eventUser);
        }
    }

    public void retake(Context context) {
        IMainActivity iMainActivity = (MainActivity) context;
        IActivityPresenter presenter = iMainActivity.getPresenter();
        if (photoTag.equals(EventUtil.USER_PHOTO)) {
            presenter.setCongratsFragment();
        }
        else {
            presenter.setTakePictureFragment(eventUser);
        }
    }
}
