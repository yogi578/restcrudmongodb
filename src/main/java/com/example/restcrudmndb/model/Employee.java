package com.example.restcrudmndb.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="EmployeeDB")

public class Employee {

	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	private String skills[]= {"",""};


}
