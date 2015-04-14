package com.ctl.it.clc.service;

import com.ctl.it.clc.model.CreateSnapshotRequest;
import com.ctl.it.clc.model.LoginResponse;
import com.ctl.it.clc.model.Server;
import com.ctl.it.clc.model.ServerOperation;

import java.util.List;

public interface ServerService {
    
    Server getServer(LoginResponse creds, String serverId);

    List<ServerOperation> createSnapshot(LoginResponse creds, CreateSnapshotRequest req);
}
