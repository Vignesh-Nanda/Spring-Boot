package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

//	void deleteById(Long id);

}
