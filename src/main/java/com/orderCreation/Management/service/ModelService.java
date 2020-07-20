package com.orderCreation.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderCreation.Management.model.model;

import com.orderCreation.Management.repository.ModelRepo;

@Service
public class ModelService {

	@Autowired 
	ModelRepo modelrepo;
	public List<model> getModelList() {
		// TODO Auto-generated method stub
		return (List<model>) modelrepo.findAll();
	}


}
