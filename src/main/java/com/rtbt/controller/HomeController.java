package com.rtbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rtbt.model.HospitalDetails;
import com.rtbt.model.HospitalLogin;
import com.rtbt.model.JwtToken;
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
	private HospitalDetailsService svc;

	@RequestMapping("/home")
	public void home() {
		System.out.println("Hi At Home");
	}
	
	@PostMapping(path = "/hospital")
	public HospitalDetails addHospital(@RequestBody HospitalDetails details) {
		return svc.addDetails(details);
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

	
//	@PostMapping(path = "/hospitalDetails")
//	public HospitalDetails getHospital(@RequestBody String emailId) {
//		return svc.getDetails(emailId);
//		
//	}
}
