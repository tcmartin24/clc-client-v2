package com.ctl.it.clc.service;

import com.ctl.it.clc.model.LoginRequest;
import com.ctl.it.clc.model.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("authService")
public class AuthServiceImpl implements AuthService {

    @Autowired
    private RestTemplate restTemplate;

    private String clcAuthServiceUrl="https://api.ctl.io/v2/authentication/login";

    @Override
    public LoginResponse login(String username, String password) {
        LoginRequest request = new LoginRequest(username, password);
        ResponseEntity<LoginResponse> responseEntity = restTemplate.postForEntity(clcAuthServiceUrl, request, LoginResponse.class);
        return responseEntity.getBody();
    }
}
