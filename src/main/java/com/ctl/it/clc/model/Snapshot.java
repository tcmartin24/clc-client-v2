package com.ctl.it.clc.model;

import java.util.ArrayList;
import java.util.List;

public class Snapshot {
    private String name;
    private List<Link> links = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
