
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

import com.example.demo.Entity.Book;
import com.example.demo.Service.Bser;

@RestController
	public class Bcont {

		@Autowired
		private Bser bs;

		@GetMapping("/get")
		public List<Book> getDetails() {
			return bs.getAllDetails();
		}

		@PostMapping("/add")
		public Book addDetails(@RequestBody Book b) {
			return bs.addDetails(b);
		}

		@DeleteMapping("/del/{id}")
		public void delDetails(@PathVariable("id") int s) {
			bs.deleteId(s);
		}

		@GetMapping("/get/{id}")
		public Optional<Book> getDetails(@PathVariable("id") int id) {
			
			return bs.getOne(id); 	
		}
	    
		
		@PutMapping("/add/{id}")
		public Book update(@PathVariable("id")int id, @RequestBody Book h)
		{
			return bs.update(id,h);
		}
		
//		@GetMapping("/page")
//		public List<Book> page()
//		{
//			return bs.get();
//		}

}
