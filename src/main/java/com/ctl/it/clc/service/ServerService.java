package com.ctl.it.clc.service;

import java.util.List;

import com.ctl.it.clc.model.CreateServerRequest;
import com.ctl.it.clc.model.CreateServerResponse;
import com.ctl.it.clc.model.CreateSnapshotRequest;
import com.ctl.it.clc.model.LoginResponse;
import com.ctl.it.clc.model.Server;
import com.ctl.it.clc.model.ServerOperation;

public interface ServerService {
    
    Server getServer(LoginResponse creds, String serverId);

    CreateServerResponse createServer(LoginResponse creds, CreateServerRequest request);
    
    List<ServerOperation> createSnapshot(LoginResponse creds, CreateSnapshotRequest req);
}
