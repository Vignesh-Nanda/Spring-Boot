package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.HotelManagement;

public interface Hotel extends JpaRepository<HotelManagement, Integer> {

//	void deleteById(Long id);

}
