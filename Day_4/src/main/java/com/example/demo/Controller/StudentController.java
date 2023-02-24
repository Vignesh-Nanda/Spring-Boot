package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.StudentService;
@RestController
public class StudentController {
	
	@Autowired
	private StudentService stuservice;
	@GetMapping("/getstudent")
	public List<Student>getDetails()
	{
		return stuservice.getAllDetails();
	}
	
	@PostMapping("/addstudent")
	public Student addDetails(@RequestBody Student s) 
	{
		return stuservice.addDetails(s);
	}
	
	
	@DeleteMapping("/del/{id}")
	public void delDetails(@PathVariable("id") int s) 
	{
		stuservice.deleteDepartmentId(s);
	}
		
		@GetMapping("/getstudent/{id}")
		public Optional<Student> getDetails(@PathVariable("id") int id)
		{
			return stuservice.getOne(id);
		}
      
		
		@PutMapping("/putstudent/{id}")
		public void update(@PathVariable("id") int id,@RequestBody Student student)
		{
			stuservice.update(id,student);
		}
}
