package com.svpsl.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class SvpslController {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String Hello() {
		return "Hello India";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-bean")
	public Hello HelloBean() {
		return new Hello("Hello world Bean");
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-bean/{name}")
	public Hello getHelloMessage(@PathVariable String name) {
		return new Hello(String.format("Hello %s", name));
	}
}
