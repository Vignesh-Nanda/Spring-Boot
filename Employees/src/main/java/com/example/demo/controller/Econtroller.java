package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Eservice;

@RestController
public class Econtroller {
	@Autowired
	private Eservice empservice;
	
	@GetMapping("/getEmployee")
	public List<Employee> getDetails()
	{
		return empservice.getAllDetails();
	}
	@PostMapping("/addEmployee")
	public Employee postDetails(@RequestBody Employee e)
	{
		return empservice.addDetails(e);
	}
}