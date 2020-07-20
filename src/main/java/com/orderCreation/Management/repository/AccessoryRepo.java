package com.orderCreation.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderCreation.Management.model.accessory;
import com.orderCreation.Management.model.model;

@Repository
public interface AccessoryRepo extends JpaRepository<accessory, Integer> {


}
