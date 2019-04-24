package com.bit.batch.dashboard.entity;



import java.sql.Timestamp;


import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;




@Entity
@Table(name="in_batch_details")
public class BatchEntity {
	
	
	@Id
	@Column(name="Job_ID")
	private String jobId;
	
	@Column(name="Job_Name")
	private String jobName;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Executable_Name")
	private String executableName;
	
	@Column(name="Executable_Path")
	private String executablePath;
		
	@Column(name="Log_File_Name")
	private String logFileName;
	
	@Column(name="Log_File_Location")
	private String logFileLocation;
	
	@Column(name="Date_Time_Created")
	@CreationTimestamp
	private Timestamp dateTimeCreated;
	
	@Column(name="Created_By")
	private String createdBy;
	
	@Column(name="Date_Time_Modified")
	@UpdateTimestamp
	private Timestamp dateTimeModified;
	
	@Column(name="Modified_By")
	private String modifiedBy;
	
	public BatchEntity() {
		
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExecutableName() {
		return executableName;
	}

	public void setExecutableName(String executableName) {
		this.executableName = executableName;
	}

	public String getExecutablePath() {
		return executablePath;
	}

	public void setExecutablePath(String executablePath) {
		this.executablePath = executablePath;
	}

	public String getLogFileName() {
		return logFileName;
	}

	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}

	public String getLogFileLocation() {
		return logFileLocation;
	}

	public void setLogFileLocation(String logFileLocation) {
		this.logFileLocation = logFileLocation;
	}

	public Timestamp getDateTimeCreated() {
		
		return dateTimeCreated;
	}

	public void setDateTimeCreated(Timestamp dateTimeCreated) {
		this.dateTimeCreated = dateTimeCreated;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getDateTimeModified() {
		return dateTimeModified;
	}

	public void setDateTimeModified(Timestamp dateTimeModified) {
		this.dateTimeModified = dateTimeModified;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	
}
