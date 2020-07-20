package com.orderCreation.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderCreation.Management.model.accessory;
import com.orderCreation.Management.model.model;
import com.orderCreation.Management.repository.AccessoryRepo;
import com.orderCreation.Management.repository.ModelRepo;
@Service
public class AccessoryService {
	@Autowired 
	AccessoryRepo accessoryrepo;
	public List<accessory> getModelList() {
		// TODO Auto-generated method stub
		return (List<accessory>) accessoryrepo.findAll();
	}

}
