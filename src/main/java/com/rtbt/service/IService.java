package com.rtbt.service;

public interface IService {

	// get global public dashboard
	public void getGlobalDashBoard();
	
	// get Hospital Information
	public void getHospitalInfo();
	
	// update bed count
	public void updateBedCount();
	
	// Update Hospital Information
	public void updateHospitalInformation();
	
	// authenticate user
	public void authenticate();
	
	// register user
	public void register();
}
