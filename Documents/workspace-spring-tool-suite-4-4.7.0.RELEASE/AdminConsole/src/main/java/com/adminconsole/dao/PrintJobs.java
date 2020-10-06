package com.adminconsole.dao;

public class PrintJobs {

	public String jobId;
	public String deviceId;
	public String status;
	public String docCount;
	public String currentDoc;
	public String lockTime;
	public String sba;

	public PrintJobs(String JobID, String DeviceID, String Status, String DocCount, String CurrentTime, String LockTime,
			String SBA) {
		this.sba = SBA;
		this.lockTime = LockTime;
		this.currentDoc = CurrentTime;
		this.docCount = DocCount;
		this.status = Status;
		this.deviceId = DeviceID;
		this.jobId = JobID;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDocCount() {
		return docCount;
	}

	public void setDocCount(String docCount) {
		this.docCount = docCount;
	}

	public String getCurrentDoc() {
		return currentDoc;
	}

	public void setCurrentDoc(String currentDoc) {
		this.currentDoc = currentDoc;
	}

	public String getLockTime() {
		return lockTime;
	}

	public void setLockTime(String lockTime) {
		this.lockTime = lockTime;
	}

	public String getSba() {
		return sba;
	}

	public void setSba(String sba) {
		this.sba = sba;
	}

}
