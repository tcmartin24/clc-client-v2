package com.ctl.it.clc.model;

public class CreateServerRequest {

	private String name;
	private String groupId;
	private String sourceServerId;
	private int cpu;
	private int memoryGB;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getSourceServerId() {
		return sourceServerId;
	}

	public void setSourceServerId(String sourceServerId) {
		this.sourceServerId = sourceServerId;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getMemoryGB() {
		return memoryGB;
	}

	public void setMemoryGB(int memoryGB) {
		this.memoryGB = memoryGB;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
