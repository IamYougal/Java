package com.workload.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workload.entities.Workload;

public interface WorkloadDao extends JpaRepository<Workload, Long>{
}
