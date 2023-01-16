package com.workload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
public class WorkloadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkloadServiceApplication.class, args);
	}

}
