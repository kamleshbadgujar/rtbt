package com.rtbt.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rtbt.dao.HospitalLoginRepository;
import com.rtbt.model.HospitalLogin;
import com.rtbt.model.HospitalLoginDetails;

@Service
public class WebSecurityUserDetailsService implements UserDetailsService {

	@Autowired
	HospitalLoginRepository repo;
	
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
    	
    	Optional<HospitalLogin> login = repo.findByUserName(userName);
    	
    	login.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));
    	
    	return login.map(HospitalLoginDetails::new).get();
    }
}
