package com.ctl.it.clc.service;

import com.ctl.it.clc.model.LoginResponse;

public interface AuthService {

    LoginResponse login(String terry, String password);
}
