package com.orderCreation.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderCreation.Management.model.accessory;
import com.orderCreation.Management.model.color;
import com.orderCreation.Management.repository.AccessoryRepo;
import com.orderCreation.Management.repository.ColorRepo;
@Service
public class ColorService {

	@Autowired 
	ColorRepo colorrepo;
	public List<color> getModelList() {
		// TODO Auto-generated method stub
		return (List<color>) colorrepo.findAll();
	}
	}


