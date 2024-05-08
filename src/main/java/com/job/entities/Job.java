package com.job.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Job {
	
	@Id
	private Long jobId;
	@Column
	private String jobName;
	@Column
	private String city;
	@Column
	private String companyName;
	public Job(Long jobId, String jobName, String city, String companyName) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.city = city;
		this.companyName = companyName;
	}
	public Job() {
		super();
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobName=" + jobName + ", city=" + city + ", companyName=" + companyName + "]";
	}
	
	

}
