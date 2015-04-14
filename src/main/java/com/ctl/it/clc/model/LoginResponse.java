package com.ctl.it.clc.model;

import java.util.List;

public class LoginResponse {
    private String bearerToken;
    private String userName;
    private String accountAlias;
    private String locationAlias;
    private List<String> roles;

    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    public String getLocationAlias() {
        return locationAlias;
    }

    public void setLocationAlias(String locationAlias) {
        this.locationAlias = locationAlias;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
