package org.institute.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.institute.entity.InqueryEntity;
import org.institute.repository.InqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InqController {

	@Autowired
	InqRepository inqRepository;
	
	@PostMapping("/inq/save")
	public InqueryEntity save(@RequestBody InqueryEntity inq) {
		return inqRepository.save(inq);
	}
	
	@GetMapping("/inq/get-all")
	public List<InqueryEntity> getAll(){
		return inqRepository.findAll();
	}
	
	@GetMapping("/inq/get-by-id")
	public InqueryEntity getById(@Param("id") long id ) {
		return inqRepository.findById(id).get();
	}
	
	@GetMapping("/inq/get-by-name")
	public InqueryEntity getByName(@Param("name") String name) {
		return inqRepository.findByName(name);
	}
	
	@GetMapping("/inq/get-by-city")
	public  List<InqueryEntity> getByCity(@Param("city") String city) {
		return inqRepository.findByCity(city);
	}
	
	@GetMapping("/inq/get-between-date")
	public  List<InqueryEntity> getByDateBetween(@Param("start") String startDate, @Param("end") String endDate) {

		System.out.println("Start date from user "+startDate);
		System.out.println("End Date from user "+endDate);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
				Date start = format.parse(startDate);
				Date end = format.parse(endDate);
				System.out.println("Start date from user "+start);
				System.out.println("End Date from user "+end);
				return inqRepository.findByInqDateBetween(start, end);
		} catch(ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
		
}
