package com.example.restcrudmndb.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.restcrudmndb.model.Employee;


@Repository
public interface EmployeeRepository extends MongoRepository<Employee,  String> {

}
