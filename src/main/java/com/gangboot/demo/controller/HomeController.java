package com.gangboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    
    @GetMapping("/about")
	public String aboutMe() {
    	
		return "JUnit 5 and Spring Boot Example.";

	}
    
}
