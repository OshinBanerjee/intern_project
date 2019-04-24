package com.bit.batch.dashboard.service;

import com.bit.batch.dashboard.bo.BatchDetailsVO;
import com.bit.schedule.dashboard.bo.ScheduleDetailsVO;

public interface Managerservice {

	public void addBatch(BatchDetailsVO batch);
	public void addSchedule(ScheduleDetailsVO schedule);
}
