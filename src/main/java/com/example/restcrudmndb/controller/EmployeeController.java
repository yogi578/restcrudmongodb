package com.example.restcrudmndb.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restcrudmndb.model.Employee;
import com.example.restcrudmndb.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository emprepo;
	
	//what is <?>
	@GetMapping("/employee")
	public ResponseEntity<?> getAllEmployees(){
		
		List<Employee> emplist = emprepo.findAll();
		
		if(emplist.size()>0) {
			return new ResponseEntity<List<Employee>>(emplist, HttpStatus.OK);
		}else
		{
			return new ResponseEntity<>("No employees found!" , HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PostMapping("/createEmployee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee emp){
		
		try {
			emp.setCreatedAt(new Date(System.currentTimeMillis()));
			
			emprepo.save(emp);
			
			return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
			
		}catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<?> getSingleEmployee(@PathVariable("id") String id){
		
		Optional<Employee> emp = emprepo.findById(id);
		
		if(emp.isPresent()) {
			
			return new ResponseEntity<>(emp.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Employee not found with id :"+id,HttpStatus.NOT_FOUND);
		}
			
			
		
		
		
	
		
	}
	
	
	
	
}
