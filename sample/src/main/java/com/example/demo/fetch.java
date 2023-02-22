package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class fetch {

	@PostMapping("/fetch")
	public String get(@RequestBody String name) {
		return "Hi " + name;
	}
}
