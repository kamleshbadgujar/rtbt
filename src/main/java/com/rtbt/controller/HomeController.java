package com.rtbt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public void home() {
		System.out.println("Hi At Home");
	}
}
