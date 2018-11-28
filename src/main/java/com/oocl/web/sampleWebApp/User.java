package com.oocl.web.sampleWebApp;

public class User {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public User(String username){
        this.username = username;
    }

}
