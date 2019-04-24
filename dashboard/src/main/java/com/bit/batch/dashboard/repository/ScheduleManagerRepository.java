package com.bit.batch.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bit.batch.dashboard.entity.ScheduleEntity;
@Repository
public interface ScheduleManagerRepository extends JpaRepository<ScheduleEntity,String> {

}
