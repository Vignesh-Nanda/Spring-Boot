package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class color {
	@GetMapping("/col")
	public String get(@RequestParam String c)
	{
		return "My favorite color is "+c;
	}

}
