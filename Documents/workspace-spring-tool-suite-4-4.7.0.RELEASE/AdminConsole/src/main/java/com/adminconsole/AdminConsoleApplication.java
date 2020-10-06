package com.adminconsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminConsoleApplication.class, args);
		System.out.println("Application Running");
	}

}
