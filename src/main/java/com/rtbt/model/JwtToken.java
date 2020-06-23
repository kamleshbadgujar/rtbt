package com.rtbt.model;

import java.io.Serializable;

public class JwtToken implements Serializable {
	
	  private final String jwt;

	    public JwtToken(String jwt) {
	        this.jwt = jwt;
	    }

	    public String getJwt() {
	        return jwt;
	    }
}
