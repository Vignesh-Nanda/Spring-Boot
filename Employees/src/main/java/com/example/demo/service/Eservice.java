package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.Erepo;


@Service
public class Eservice {
	@Autowired
	private Erepo emp;
	public Employee addDetails(Employee e)
	{
		return emp.save(e);
	}
	public List<Employee>getAllDetails()
	{
		return emp.findAll();
	}
}