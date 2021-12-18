package org.institute.controller;

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
	@GetMapping("/inq/get-by-date")
	public List<InqueryEntity> getByDate(@Param("date") String date) {
		return inqRepository.findByInqDate(date);
	}
	
	
	@GetMapping("/inq/get-between-date")
	public  List<InqueryEntity> getByDateBetween(@Param("startDate") String startDate, @Param("end") String endDate) {

				return inqRepository.findByInqDateBetween(startDate, endDate);
	}
	
	@GetMapping("/inq/get-by-month")
	public  List<InqueryEntity> getByMonth(@Param("month") int month){
		return inqRepository.findByMonth(month);
	}
	
	@GetMapping("/inq/get-by-year")
	public  List<InqueryEntity> getByYear(@Param("year") int year){
		return inqRepository.findByYear(year);
	}
	
	@GetMapping("/inq/get-by-monthyear")
	public  List<InqueryEntity> getByMonthYear(@Param("month") int month,@Param("year") int year){
		return inqRepository.findByMonthYear(month,year);
	}
}
