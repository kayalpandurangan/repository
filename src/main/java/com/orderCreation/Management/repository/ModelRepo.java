package com.orderCreation.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderCreation.Management.model.model;
import com.orderCreation.Management.model.series;

@Repository
public interface ModelRepo extends JpaRepository<model, Integer> {


	
}




