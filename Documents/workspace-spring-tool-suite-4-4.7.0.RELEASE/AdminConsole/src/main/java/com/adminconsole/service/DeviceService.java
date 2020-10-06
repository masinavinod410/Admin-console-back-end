package com.adminconsole.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminconsole.dao.LockedDevices;

@Service
public class DeviceService {
	// @Autowired
	// LockedDevices lockedDevices;

	// ArrayList<LockedDevices> devicesList = new ArrayList<LockedDevices>();
	private List<LockedDevices> devicesList = new ArrayList<>();

	public List<LockedDevices> getLockedDevices() {
		// data();
		return devicesList;
	}

	@PostConstruct
	public void data() {
		// ArrayList<LockedDevices> devicesList = new ArrayList<LockedDevices>();

		devicesList.add(new LockedDevices("RR001", "PRT-1", "02-09-2020"));
		devicesList.add(new LockedDevices("RR002", "PRT-2", "02-09-2020"));
		devicesList.add(new LockedDevices("RR003", "PRT-3", "02-09-2020"));
		devicesList.add(new LockedDevices("RR004", "PRT-4", "02-09-2020"));
		devicesList.add(new LockedDevices("RR005", "PRT-5", "02-09-2020"));
		devicesList.add(new LockedDevices("RR006", "PRT-6", "02-09-2020"));
		devicesList.add(new LockedDevices("RR007", "PRT-7", "02-09-2020"));
		devicesList.add(new LockedDevices("RR008", "PRT-8", "02-09-2020"));
		devicesList.add(new LockedDevices("RR009", "PRT-9", "02-09-2020"));
		devicesList.add(new LockedDevices("RR010", "PRT-10", "02-09-2020"));
		devicesList.add(new LockedDevices("RR011", "PRT-11", "02-09-2020"));
		devicesList.add(new LockedDevices("RR012", "PRT-12", "02-09-2020"));
		devicesList.add(new LockedDevices("RR013", "PRT-13", "02-09-2020"));
		devicesList.add(new LockedDevices("RR014", "PRT-14", "02-09-2020"));
		devicesList.add(new LockedDevices("RR015", "PRT-15", "02-09-2020"));
		devicesList.add(new LockedDevices("RR016", "PRT-16", "02-09-2020"));
		devicesList.add(new LockedDevices("RR017", "PRT-17", "02-09-2020"));
		devicesList.add(new LockedDevices("RR018", "PRT-18", "02-09-2020"));
		devicesList.add(new LockedDevices("RR019", "PRT-19", "02-09-2020"));
		devicesList.add(new LockedDevices("RR020", "PRT-20", "02-09-2020"));
		devicesList.add(new LockedDevices("RR021", "PRT-21", "02-09-2020"));
		devicesList.add(new LockedDevices("RR022", "PRT-22", "02-09-2020"));
		devicesList.add(new LockedDevices("RR023", "PRT-23", "02-09-2020"));
		devicesList.add(new LockedDevices("RR024", "PRT-24", "02-09-2020"));
	}

	public LockedDevices removeDevice(String petId) {
		LockedDevices device = null;
		System.out.println("remove device>>>>>>>>>>>>>" + petId);

		if ((device = getJobId(petId)) != null) {
			devicesList.remove(device);
			return device;
		}
		return null;
	}

	public LockedDevices getJobId(String jobid) {

		System.out.println("inside getjob id");
		System.out.println(jobid);
		for (LockedDevices device : devicesList) {
			System.out.println("inside for loop>>>>" + device.getJobId());
			if (device.getJobId().equals(jobid)) {
				System.out.println("inside if loop ingetjob id");
				return device;
			}
		}
		return null;
	}

}
