package com.example.demo.Service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.HotelManagement;
import com.example.demo.Repository.Hotel;


@Service
public class HotelService {

	@Autowired
	public Hotel hs;

	public HotelManagement addDetails(HotelManagement h) {
		return hs.save(h);
	}

	public List<HotelManagement> getAllDetails() {
		return hs.findAll();
	}

	public void deleteId(int id) {
		hs.deleteById(id);
	}

	public Optional<HotelManagement> getOne(int id) {
		return hs.findById(id);
	}
	
	public HotelManagement update(int id,HotelManagement h)
	{
		HotelManagement hm=hs.findById(id).get();
		
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getFname()))))
		{
			hm.setFname(h.getFname());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getLname()))))
		{
			hm.setLname(h.getLname());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getCid()))))
		{
			hm.setCid(h.getCid());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getCod()))))
		{
			hm.setCod(h.getCod());
		}
		if(Objects.nonNull(hm)&&(h.getNor()!=0))
		{
			hm.setNor(h.getNor());
		}
		if(Objects.nonNull(hm)&&(h.getNop()!=0))
		{
			hm.setNop(h.getNop());
		}
		if(Objects.nonNull(hm)&&(h.getPhn()!=0))
		{
			hm.setPhn(h.getPhn());
		}
		return hs.save(hm);
	}
	
	public List<HotelManagement> get()
	{
		Pageable p=PageRequest.of(0, 2, Sort.by(Sort.Direction.DESC,"lname"));
		Page<HotelManagement> c=hs.findAll(p);
		return  c.toList();	}
}