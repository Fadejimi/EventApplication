package com.example.sfldpguser_24.eventcheckinapplication.models;

import org.json.JSONException;
import org.json.JSONObject;

public class EventUser {
    private String photoUrl;
    private String idUrl;
    private String userName;

    public EventUser() {

    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getIdUrl() {
        return idUrl;
    }

    public void setIdUrl(String idUrl) {
        this.idUrl = idUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toJson() {

            JSONObject jsonObject= new JSONObject();
            try {
                jsonObject.put("userName", getUserName());
                jsonObject.put("photoUrl", getPhotoUrl());
                jsonObject.put("idUrl", getIdUrl());

                return jsonObject.toString();
            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "";
            }


    }
}
