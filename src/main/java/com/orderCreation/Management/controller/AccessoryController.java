package com.orderCreation.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderCreation.Management.model.accessory;
import com.orderCreation.Management.model.model;
import com.orderCreation.Management.service.AccessoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AccessoryController {
@Autowired
AccessoryService accessoryService;
@GetMapping("/accessorytask")
public List<accessory> fetchModelList(){
	
	return accessoryService.getModelList();
	
}
}
