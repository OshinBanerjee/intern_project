package com.bit.batch.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bit.batch.dashboard.entity.BatchEntity;
@Repository
public interface BatchManagerRepository extends JpaRepository<BatchEntity, String> {

}
