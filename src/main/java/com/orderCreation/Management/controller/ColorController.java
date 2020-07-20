package com.orderCreation.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderCreation.Management.model.accessory;
import com.orderCreation.Management.model.color;
import com.orderCreation.Management.service.AccessoryService;
import com.orderCreation.Management.service.ColorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ColorController {
	@Autowired
	ColorService colorService;
	@GetMapping("/colortask")
	public List<color> fetchModelList(){
		
		return colorService.getModelList();
		
	}

}
