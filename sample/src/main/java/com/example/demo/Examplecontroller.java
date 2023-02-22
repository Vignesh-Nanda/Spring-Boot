package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Examplecontroller {
//	@GetMapping("/hello")
//	public String Hello()
//	{
//		return "Hello";
//	}
	@GetMapping("/hello1")
	public String Hello1()
	{
		return "welcome";
	}
	
}
