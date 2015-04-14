package com.ctl.it.clc.model;

import java.util.ArrayList;
import java.util.List;

public class ServerOperation {
    private String server;
    private boolean isQueued;
    List<Link> links = new ArrayList<>();

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public boolean isQueued() {
        return isQueued;
    }

    public void setIsQueued(boolean isQueued) {
        this.isQueued = isQueued;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
