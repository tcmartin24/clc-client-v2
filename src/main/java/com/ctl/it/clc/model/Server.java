package com.ctl.it.clc.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Server {
    private String id;
    private String name;
    private String description;
    private String groupId;
    private boolean isTemplate;
    private String locationId;
    private String osType;
    private String status;
    private ServerDetails details;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public boolean isTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServerDetails getDetails() {
        return details;
    }

    public void setDetails(ServerDetails details) {
        this.details = details;
    }
}
