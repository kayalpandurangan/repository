package com.orderCreation.Management.repository;

import org.springframework.stereotype.Repository;

import com.orderCreation.Management.model.accessory;
import com.orderCreation.Management.model.color;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface ColorRepo extends JpaRepository<color, Integer> {


}
	


