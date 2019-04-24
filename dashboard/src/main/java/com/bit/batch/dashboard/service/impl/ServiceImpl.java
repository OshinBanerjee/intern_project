package com.bit.batch.dashboard.service.impl;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bit.batch.dashboard.bo.BatchDetailsVO;
import com.bit.batch.dashboard.entity.BatchEntity;
import com.bit.batch.dashboard.entity.ScheduleEntity;
import com.bit.batch.dashboard.repository.BatchManagerRepository;
import com.bit.batch.dashboard.repository.ScheduleManagerRepository;
import com.bit.batch.dashboard.service.Managerservice;
import com.bit.schedule.dashboard.bo.ScheduleDetailsVO;


@Service
public class ServiceImpl implements Managerservice {
	

	private BatchManagerRepository batchManagerRepository;
	private ScheduleManagerRepository scheduleManagerRepository;
	private Mapper dozerMapper;
	@Autowired
	public ServiceImpl(BatchManagerRepository batchManagerRepository,
			ScheduleManagerRepository scheduleManagerRepository, Mapper dozerMapper) {
		//super();
		this.batchManagerRepository = batchManagerRepository;
		this.scheduleManagerRepository = scheduleManagerRepository;
		this.dozerMapper = dozerMapper;
	}

	@Override
	public void addBatch(BatchDetailsVO batch) {
		
		batchManagerRepository.save( dozerMapper.map(batch,BatchEntity.class));
	}

	@Override
	public void addSchedule(ScheduleDetailsVO schedule) {
		System.out.println(schedule.getDependency());
		scheduleManagerRepository.save(dozerMapper.map(schedule, ScheduleEntity.class));
	}
}
