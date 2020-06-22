package com.rtbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtbt.model.HospitalDetails;
import com.rtbt.service.HospitalDetailsService;

@RestController
public class HomeController {
	
	@Autowired
	private HospitalDetailsService svc;

	@RequestMapping("/home")
	public void home() {
		System.out.println("Hi At Home");
	}
	
	@PostMapping(path = "/hospital")
	public HospitalDetails addHospital(@RequestBody HospitalDetails details) {
		return svc.addDetails(details);
		
	}
	
//	@PostMapping(path = "/hospitalDetails")
//	public HospitalDetails getHospital(@RequestBody String emailId) {
//		return svc.getDetails(emailId);
//		
//	}
}
