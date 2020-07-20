package com.orderCreation.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderCreation.Management.model.series;
import com.orderCreation.Management.repository.SeriesRepo;
@Service
public class SeriesService {
	@Autowired 
	SeriesRepo repo;
	public List<series> getSeriesList() {
		// TODO Auto-generated method stub
		return (List<series>) repo.findAll();
	}

}
