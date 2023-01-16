package com.workload.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workload.dao.WorkloadDao;
import com.workload.entities.Workload;



@Service
public class WorkloadServiceImp implements WorkloadService {
	
	@Autowired
	private WorkloadDao workload_dao;
	
	@Override
	public List<Workload> get_workloads() {
		return workload_dao.findAll();
	}
	
	@Override
	public Optional<Workload> get_workload(Long workload_id) {
		Optional<Workload> workload = workload_dao.findById(workload_id); 
		if (workload == null) {
			return Optional.empty();
		}
		return workload;
	}
	
	
	@Override
	public Workload create_workload(Workload workload) {
		return workload_dao.save(workload);
	}
	

	@Override
	public Workload update_workload(Workload workload) {
		return workload_dao.save(workload);
	}
	

}
