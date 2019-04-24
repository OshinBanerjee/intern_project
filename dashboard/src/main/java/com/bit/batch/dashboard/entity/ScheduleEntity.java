package com.bit.batch.dashboard.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="in_batch_schedule")
public class ScheduleEntity {
	
	@Id
	@Column(name="Server_Name")
	private String serverName;
	
	@Column(name="Batch_ID")
	private String batchId;
	
	@Column(name="Run_Days")
	private String runDays;
	
	@Column(name="Start_Time")
	
	private String startTime;
	
	@Column(name="End_Time")
	private String endTime;
	
	@Column(name="Max_Duration")
	private int maxDuration;
	
	@Column(name="Active_Indicator")
	private String activeIndicator;
	
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
	
	@Column(name="Dependency")
	private String dependency;

	public ScheduleEntity() {
		
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getRunDays() {
		return runDays;
	}

	public void setRunDays(String runDays) {
		this.runDays = runDays;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getMaxDuration() {
		return maxDuration;
	}

	public void setMaxDuration(int maxDuration) {
		this.maxDuration = maxDuration;
	}

	public String getActiveIndicator() {
		return activeIndicator;
	}

	public void setActiveIndicator(String activeIndicator) {
		this.activeIndicator = activeIndicator;
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

	public String getDependency() {
		return dependency;
	}

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	
}
