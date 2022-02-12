package com.svpsl.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class BasicAuthenticationController {

	
	@GetMapping( "/basicauth")
	public AuthenticationBean getHelloMessage() {
		return new AuthenticationBean("You are authenticated.");
	}
}
