package com.orderCreation.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderCreation.Management.model.series;
import com.orderCreation.Management.service.SeriesService;
@CrossOrigin(origins="http://localhost:4200")
@RestController

public class SeriesController {
	@Autowired
	SeriesService seriesService;
	
	@GetMapping("/seriestask")
	public List<series> fetchSeriesList(){
		
		return seriesService.getSeriesList();
		
	}
}
