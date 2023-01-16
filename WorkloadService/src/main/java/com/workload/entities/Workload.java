package com.workload.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Workload {
	
@Id	
private Long workload_id;
private String workload_name;
private String workload_desc;
private Long tenant_id;
private Long workload_owner;
private String environment;
private Boolean archive;
private String created_by;


public Long getWorkload_id() {
	return workload_id;
}


public void setWorkload_id(Long workload_id) {
	this.workload_id = workload_id;
}


public String getWorkload_name() {
	return workload_name;
}


public void setWorkload_name(String workload_name) {
	this.workload_name = workload_name;
}


public String getWorkload_desc() {
	return workload_desc;
}


public void setWorkload_desc(String workload_desc) {
	this.workload_desc = workload_desc;
}


public Long getTenant_id() {
	return tenant_id;
}


public void setTenant_id(Long tenant_id) {
	this.tenant_id = tenant_id;
}


public Long getWorkload_owner() {
	return workload_owner;
}


public void setWorkload_owner(Long workload_owner) {
	this.workload_owner = workload_owner;
}


public String getEnvironment() {
	return environment;
}


public void setEnvironment(String environment) {
	this.environment = environment;
}


public Boolean getArchive() {
	return archive;
}


public void setArchive(Boolean archive) {
	this.archive = archive;
}


public String getCreated_by() {
	return created_by;
}


public void setCreated_by(String created_by) {
	this.created_by = created_by;
}


public Workload() {
	super();
	// TODO Auto-generated constructor stub
}


public Workload(Long workload_id, String workload_name, String workload_desc, Long tenant_id, Long workload_owner,
		String environment, Boolean archive, String created_by) {
	super();
	this.workload_id = workload_id;
	this.workload_name = workload_name;
	this.workload_desc = workload_desc;
	this.tenant_id = tenant_id;
	this.workload_owner = workload_owner;
	this.environment = environment;
	this.archive = archive;
	this.created_by = created_by;
}	
	
	
	
}
