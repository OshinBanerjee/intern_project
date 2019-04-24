package com.bit.batch.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bit.batch.dashboard.bo.BatchDetailsVO;
import com.bit.batch.dashboard.service.Managerservice;

import com.bit.schedule.dashboard.bo.ScheduleDetailsVO;

@RestController
@Component
public class DashboardController {
	
	@Autowired
	private Managerservice manageService;
	
	@RequestMapping(value="/dashboard/test",method=RequestMethod.GET)
	public String testDashboardRest(){
		return "Welcome to Batch Job Monitoring Dashboard..";
	}
	
	@RequestMapping(value="/dashboard/addBatch",method=RequestMethod.POST,consumes="application/json")
	public String addBatchDetails(@RequestBody BatchDetailsVO job){				
		manageService.addBatch(job);		
		return job.getLogFileLocation();
		//return job.getJobName();
	}
	@RequestMapping(value="/dashboard/addSchedule",method=RequestMethod.POST,consumes="application/json")
	public String addScheduleDetails(@RequestBody ScheduleDetailsVO schedule){
		manageService.addSchedule(schedule);
		return schedule.getDependency();	}
}
