package com.adminconsole.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.adminconsole.dao.PrintJobs;

@Service
public class PrintJobsService {

	private List<PrintJobs> printJobsList = new ArrayList<>();

	public List<PrintJobs> getPrintJobs() {
		// data();
		return printJobsList;
	}

	@PostConstruct
	public void printJobsData() {
		// ArrayList<LockedDevices> devicesList = new ArrayList<LockedDevices>();

		printJobsList.add(new PrintJobs("printjob-1", "PRT-1", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-2", "PRT-2", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-3", "PRT-3", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-4", "PRT-4", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-5", "PRT-5", "Waiting", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-6", "PRT-6", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-7", "PRT-7", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-8", "PRT-1", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-9", "PRT-3", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-10", "PRT-2", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-11", "PRT-4", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-12", "PRT-5", "Waiting", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-13", "PRT-6", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-14", "PRT-1", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-15", "PRT-2", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-16", "PRT-3", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-17", "PRT-4", "Waiting", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-18", "PRT-5", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-19", "PRT-1", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-20", "PRT-13", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-21", "PRT-4", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-22", "PRT-6", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-23", "PRT-3", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-24", "PRT-4", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));
		printJobsList.add(new PrintJobs("printjob-25", "PRT-2", "Done", "1", "1", "20-08-2020 17:25:42", "XY1"));

		ListIterator<PrintJobs> itr = printJobsList.listIterator();
		for (PrintJobs printjob : printJobsList) {
			System.out.println("print job id>>>>" + printjob.jobId);
			System.out.println("print job status>>>>" + printjob.status);
			// System.out.println("Student Name : "+student.getName()+" Roll Number :
			// "+student.getRollno()+" Biology : "+student.getBiology()+" Maths :
			// "+student.getMaths()+" Science : "+student.getScience());
		}

	}

	public PrintJobs removePrintJobs(String jobId) {
		PrintJobs printjob = null;
		System.out.println("remove device>>>>>>>>>>>>>" + jobId);

		if ((printjob = getJobId(jobId)) != null) {
			printJobsList.remove(printjob);
			return printjob;
		}
		return null;
	}

	public PrintJobs getJobId(String jobid) {

		System.out.println("inside getjob id");
		System.out.println(jobid);
		for (PrintJobs printjob : printJobsList) {
			System.out.println("inside for loop>>>>" + printjob.getJobId());
			if (printjob.getJobId().equals(jobid)) {
				System.out.println("inside if loop ingetjob id");
				return printjob;
			}
		}
		return null;
	}

	public void updatePrintjobStatus(String jobId, String status) {
		for (PrintJobs printjob : printJobsList) {
			System.out.println("print job id>>>>" + printjob.jobId);
			System.out.println("print job status>>>>" + printjob.status);

			if (printjob.jobId.equals(jobId)) {
				printjob.setStatus(status);

			}

		}
		System.out.println("-------------------------------------After Update---------------------------------------");
		ListIterator<PrintJobs> itr2 = printJobsList.listIterator();
		for (PrintJobs printjob : printJobsList) {
			System.out.println("job id>" + printjob.jobId);
			System.out.println("job status>" + printjob.status);
		}

	}
}
