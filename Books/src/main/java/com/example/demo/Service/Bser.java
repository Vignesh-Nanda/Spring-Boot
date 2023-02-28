package com.example.demo.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Repo.Books;

@Service

public class Bser {
	@Autowired
	public Books hs;

	public Book addDetails(Book h) {
		return hs.save(h);
	}

	public List<Book> getAllDetails() {
		return hs.findAll();
	}

	public void deleteId(int id) {
		hs.deleteById(id);
	}

	public Optional<Book> getOne(int id) {
		return hs.findById(id);
	}
	
	public Book update(int id,Book h)
	{
		Book hm=hs.findById(id).get();
		
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getName()))))
		{
			hm.setName(h.getName());
		}
		
		if(Objects.nonNull(hm)&&(h.getPrice()!=0))
		{
			hm.setPrice(h.getPrice());
		}
		if(Objects.nonNull(hm)&&(h.getQuantity()!=0))
		{
			hm.setQuantity(h.getQuantity());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getAname()))))
		{
			hm.setAname(h.getAname());
		}
		return hs.save(hm);
	}

}
