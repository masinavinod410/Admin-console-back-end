package com.adminconsole.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.adminconsole.dao.LockedDevices;
import com.adminconsole.dao.PrintJobs;
import com.adminconsole.service.DeviceService;
import com.adminconsole.service.PrintJobsService;

@RestController
@RequestMapping("/printservice/adminconsole")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {

	@Autowired
	DeviceService deviceService;

	@Autowired
	PrintJobsService printJobsService;


	@GetMapping("/getlockeddevices")
	public ResponseEntity<List<LockedDevices>> getLockedDevices() {
		System.out.println("touch2");
		List<LockedDevices> lockedDevices = deviceService.getLockedDevices();
		System.out.println(lockedDevices.size());
		return new ResponseEntity<List<LockedDevices>>(lockedDevices, HttpStatus.OK);
	}

	@PostMapping("/unlocklockeddevices")
	public String unlockDevices(@RequestBody ArrayList<String> payload) {
		for (String temp : payload) {
			deviceService.removeDevice(temp);
			System.out.println("arrayliteration" + temp);
		}
		return "unlocked";
	}

	@GetMapping("/getprintjobs")
	public ResponseEntity<List<PrintJobs>> getPrintJobs() {
		System.out.println("print jobs touch");
		List<PrintJobs> printjobs = printJobsService.getPrintJobs();
		System.out.println(printjobs.size());
		return new ResponseEntity<List<PrintJobs>>(printjobs, HttpStatus.OK);
	}

	@PostMapping("/deleteprintdevices")
	public String deletePrintJobs(@RequestBody ArrayList<String> payload) {
		for (String temp : payload) {
			printJobsService.removePrintJobs(temp);
			System.out.println("arrayliteration" + temp);
		}
		return "Delected";
	}

	// test


	@RequestMapping(value="/unlock")
	public String updatePetById(@RequestParam("jobId") String jobId, @RequestParam("status") String status) {
		System.out.println("Hit");
		System.out.println("param id>>>>"+jobId);
		System.out.println("param status>>>"+status);
		printJobsService.updatePrintjobStatus(jobId, status);
		return "Updated";
	}

}
