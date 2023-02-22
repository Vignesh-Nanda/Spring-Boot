package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
 
	@GetMapping("/print")
	 String get()
	{
		return "Welcome to Git Hub";
	}
}
