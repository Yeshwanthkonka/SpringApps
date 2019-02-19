package com.hiberboot.exp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiberboot.exp.model.Laptop;
import com.hiberboot.exp.service.LaptopService;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;

    @PostMapping("/create")	
	public void lapCreate(@RequestBody Laptop laptop,Long sId) {
    	System.out.println(laptop.getLaptopName()+"::"+sId);
		laptopService.save(laptop,sId);
	}
	
}
