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
	private Long jobId;
	@Column
	private String jobName;
	@Column
	private String city;
	@Column
	private String companyName;
	@Column
	private Boolean WorkFromHome;
	@Column
	private Long vacantPos;

	public Job() {
	}

	public Job(String jobName, String companyName, String city, Boolean workFromHome, Long vacantPos) {
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
