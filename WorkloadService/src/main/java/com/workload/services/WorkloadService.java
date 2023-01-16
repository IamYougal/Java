package com.workload.services;

import java.util.List;
import java.util.Optional;

import com.workload.entities.Workload;

public interface WorkloadService {
	
	public List<Workload> get_workloads();
	

	public Optional<Workload> get_workload(Long workload_id);
	
	public Workload create_workload(Workload workload);
	
	public Workload update_workload(Workload workload);
	
	
	

}
