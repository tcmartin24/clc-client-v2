package com.ctl.it.clc.model;

import java.util.ArrayList;
import java.util.List;

public class ServerDetails {
    private List<ServerAddress> ipAddresses = new ArrayList<>();
    private List<Snapshot> snapshots = new ArrayList<>();

    public List<ServerAddress> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<ServerAddress> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public List<Snapshot> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<Snapshot> snapshots) {
        this.snapshots = snapshots;
    }
}
