package com.ctl.it.clc.service;

import com.ctl.it.clc.IntegrationTests;
import com.ctl.it.clc.model.CreateSnapshotRequest;
import com.ctl.it.clc.model.LoginResponse;
import com.ctl.it.clc.model.Server;
import com.ctl.it.clc.model.ServerOperation;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ServerServiceTest extends IntegrationTests {

    @Autowired
    private AuthService authService;

    @Autowired
    private ServerService service;
    private LoginResponse creds;

    @Before
    public void setUp() throws Exception {
        creds = authService.login(clcUsername, clcPassword);
    }

    @Test
    public void canGetServers() {
        Server server = service.getServer(creds, "VA1TCSBPATCH02");
        assertEquals("2015-04-06.18:56:55", server.getDetails().getSnapshots().get(0).getName());
    }

    @Test
    public void canCreateSnapshot() {
        Server server = service.getServer(creds, "VA1TCSBPATCH02");
        int startSnapshotCount = server.getDetails().getSnapshots().size();

        CreateSnapshotRequest req = new CreateSnapshotRequest(7, "VA1TCSBPATCH02");
        List<ServerOperation> serverOps = service.createSnapshot(creds, req);

        server = service.getServer(creds, "VA1TCSBPATCH02");
        int endSnapshotCount = server.getDetails().getSnapshots().size();

//        for (ServerOperation op : serverOps) {
//            System.out.println(op.getServer());
//            System.out.println(op.isQueued());
//            System.out.println("---------------------------");
//        }
        assertEquals(startSnapshotCount + 1, endSnapshotCount);
    }


}
