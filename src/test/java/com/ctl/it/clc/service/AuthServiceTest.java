package com.ctl.it.clc.service;

import com.ctl.it.clc.IntegrationTests;
import com.ctl.it.clc.model.LoginResponse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AuthServiceTest extends IntegrationTests {

    @Autowired
    private AuthService service;

    @Test
    public void validLoginResultsInBearerToken() {
        LoginResponse loginResponse = service.login(clcUsername, clcPassword);

        assertNotNull(loginResponse.getBearerToken());
        assertEquals(clcUsername, loginResponse.getUserName());
        assertEquals("TCSB", loginResponse.getAccountAlias());
        assertEquals("VA1", loginResponse.getLocationAlias());
        assertEquals(Arrays.asList("ServerAdmin", "ServerOperator"), loginResponse.getRoles());
        System.out.println(loginResponse.getBearerToken());
    }
}