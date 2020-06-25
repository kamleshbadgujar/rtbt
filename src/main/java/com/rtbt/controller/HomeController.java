package com.rtbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rtbt.model.HospitalBeds;
import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;
import com.rtbt.model.JwtToken;
import com.rtbt.service.HospitalBedService;
import com.rtbt.service.HospitalDetailsService;
import com.rtbt.service.WebSecurityUserDetailsService;
import com.rtbt.util.JwtUtil;

@RestController
public class HomeController {
	

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private WebSecurityUserDetailsService userDetailsService;
	
	@Autowired
	private HospitalDetailsService hospitalDetailsService;
	
	@Autowired
	private HospitalBedService hospitalBedService;

	@RequestMapping("/home")
	public void home() {
		System.out.println("Hi At Home");
	}
	

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody HospitalLogin authenticationRequest) throws Exception {

		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword())
			);
		}
		catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}


		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUserName());

		final String jwt = jwtTokenUtil.generateToken(userDetails);
		

		return ResponseEntity.ok(new JwtToken(jwt));
	}

	@PostMapping(path = "/hospital")
	public HospitalDetails addHospital(@RequestBody HospitalDetails details) {
		return hospitalDetailsService.addDetails(details);
	}
	
	@GetMapping(path = "/hospitalDetails/{email}")
	public HospitalDetails getHospital(@PathVariable String email) {
		return hospitalDetailsService.getDetails(email);
		
	}
	
	@PutMapping(path = "/updateHospitalDetails")
	public HospitalDetails updateHospitalDetails(@RequestBody HospitalDetails updatedDetails) {
		return hospitalDetailsService.updateDetails(updatedDetails);
	}
	
	@DeleteMapping(path = "/deleteHospitalDetails/{email}")
	public HttpStatus deleteHospitalDetails(@PathVariable String email) {
		hospitalDetailsService.deleteHospitalDetails(email);
		return HttpStatus.OK;
	}
	
	@PostMapping(path = "/hospitalBeds")
	public HospitalBeds addHospitalBedDetails(@RequestBody HospitalBeds bedDetails) {
		return hospitalBedService.addBedDetails(bedDetails);
	}
	
	@GetMapping(path = "/hospitalBedDetails/{email}")
	public HospitalBeds getHospitalBedDetails(@PathVariable String email) {
		return hospitalBedService.getBedDetails(email);
		
	}
	
	@PutMapping(path = "/updateBedDetails")
		public HospitalBeds updateBedDetails(@RequestBody HospitalBeds bedDetails) {
			return hospitalBedService.updateBedDetails(bedDetails);
			
		}
	
	@DeleteMapping(path = "/deleteBedDetails/{email}")
		public HttpStatus deleteBedDetails(@PathVariable String email) {
		hospitalBedService.deleteBedDetails(email);
		return HttpStatus.OK;
	}
	
}
