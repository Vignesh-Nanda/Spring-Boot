package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	
@Autowired
private StudentRepo stu;

public Student addDetails(Student s)
{
	return stu.save(s);
}
public List<Student> getAllDetails()
{
	List<Student> arr=new ArrayList<>();
	arr=stu.findAll();
	return arr;
}

	public void deleteDepartmentId(Long id)
	{
	stu.deleteById(id);
	}
	
	public Optional<Student> getOne(Long id)
	{
		return stu.findById(id);
	}
}
