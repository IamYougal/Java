package com.workload.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.workload.entities.Workload;
import com.workload.services.WorkloadService;

@RestController
public class WorkloadController {
	
	@Autowired
	private WorkloadService workloadservice;
	
	@GetMapping("/wellarchitected/resources/tenant/{tenant_id}/workloads")	
	public List<Workload> get_all_workloads() {
		return this.workloadservice.get_workloads();
	}
	
	@PostMapping("/wellarchitected/resources/workload")
	public Workload create_workload(@RequestBody Workload workload) {
		System.out.println("workload_body: " + workload);
		return this.workloadservice.create_workload(workload);
	}
	
	@GetMapping("/wellarchitected/resources/workload/{workload_id}")
	public Optional<Workload> get_workload(@PathVariable String workload_id) {
		return this.workloadservice.get_workload(Long.parseLong(workload_id));
	}
	
	@PutMapping("/wellarchitected/resources/workload/{workload_id}")
	public Workload update_workload(@RequestBody Workload workload) {
		return this.workloadservice.update_workload(workload);
	}
	
}
