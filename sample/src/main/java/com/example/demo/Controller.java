package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	public ValueAnnotation bean;
	
	@RequestMapping("ProName")
	String get()
	{
		return bean.get();
	}

}
