package com.ctl.it.clc.model;

public class CreateServerResponse {

	private String server;
	private boolean isQueued;
	private String errorMessage;

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public boolean isQueued() {
		return isQueued;
	}

	public void setQueued(boolean isQueued) {
		this.isQueued = isQueued;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
