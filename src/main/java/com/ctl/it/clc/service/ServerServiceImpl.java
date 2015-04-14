package com.ctl.it.clc.service;

import com.ctl.it.clc.model.CreateSnapshotRequest;
import com.ctl.it.clc.model.LoginResponse;
import com.ctl.it.clc.model.Server;
import com.ctl.it.clc.model.ServerOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service("serverService")
public class ServerServiceImpl implements ServerService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Server getServer(LoginResponse creds, String serverId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + creds.getBearerToken());
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String requestUrl = String.format("https://api.ctl.io/v2/servers/%s/%s", creds.getAccountAlias(), serverId);
        ResponseEntity<Server> serverResponse = restTemplate.exchange(requestUrl, HttpMethod.GET, entity, Server.class);
        return serverResponse.getBody();
    }

    @Override
    public List<ServerOperation> createSnapshot(LoginResponse creds, CreateSnapshotRequest req) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + creds.getBearerToken());
        HttpEntity<CreateSnapshotRequest> entity = new HttpEntity<>(req, headers);
        String requestUrl = String.format("https://api.ctl.io/v2/operations/%s/servers/createSnapshot", creds.getAccountAlias());
        ResponseEntity<List> serverResponse = restTemplate.exchange(requestUrl, HttpMethod.POST, entity, List.class);
        return serverResponse.getBody();
    }


}
