package com.job.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Job {
	
	@Id
	@Column(name="job_id")
	private long jobId;
	@Column(name="job_name")
	private String jobName;
	@Column(name="city")
	private String city;
	@Column(comp_name)
	private String companyName;
	@Column(name="wfh")
	private boolean WorkFromHome;
	@Column(name="vacant")
	private long vacantPos;

	public Job() {
	}

	public Job(String jobName, String companyName, String city, boolean workFromHome, long vacantPos) {
		this.jobName = jobName;
		this.companyName = companyName;
		this.city = city;
		WorkFromHome = workFromHome;
		this.vacantPos = vacantPos;
	}

	@Override
	public String toString() {
		return "Job{" +
				"jobId=" + jobId +
				", jobName='" + jobName + '\'' +
				", city='" + city + '\'' +
				", companyName='" + companyName + '\'' +
				", WorkFromHome=" + WorkFromHome +
				", vacantPos=" + vacantPos +
				'}';
	}
}
