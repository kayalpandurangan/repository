package com.orderCreation.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.orderCreation.Management.model.model;
import com.orderCreation.Management.model.series;
import com.orderCreation.Management.service.ModelService;
import com.orderCreation.Management.service.SeriesService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ModelController {
	@Autowired
	ModelService modelService;
	
	@GetMapping("/modeltask")
	public List<model> fetchModelList(){
		
		return modelService.getModelList();
		
	}

}
