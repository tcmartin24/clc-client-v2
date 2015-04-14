package com.ctl.it.clc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateSnapshotRequest {
    int snapshotExpirationDays;
    List<String> serverIds = new ArrayList<>();

    public CreateSnapshotRequest(int snapshotExpirationDays, String... serverIds) {
        this.snapshotExpirationDays = snapshotExpirationDays;
        this.serverIds.addAll(Arrays.asList(serverIds));
    }

    public int getSnapshotExpirationDays() {
        return snapshotExpirationDays;
    }

    public void setSnapshotExpirationDays(int snapshotExpirationDays) {
        this.snapshotExpirationDays = snapshotExpirationDays;
    }

    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }
}
