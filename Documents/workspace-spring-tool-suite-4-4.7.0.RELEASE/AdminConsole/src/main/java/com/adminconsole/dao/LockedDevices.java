package com.adminconsole.dao;

public class LockedDevices {
	public String jobId;
	public String deviceId;
	public String createdTime;

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public LockedDevices(String JobID, String DeviceID, String CreatedTime) {
		this.createdTime = CreatedTime;
		this.deviceId = DeviceID;
		this.jobId = JobID;
	}

}
