package com.example.restcrudmndb;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class DemoTest {
	
	@Test (priority=1)
	
	public void validateGetAllEmployees() {

		given().when().get("http://localhost:8089/employee").then().statusCode(200).log().all();
		System.out.println("Test Passed!");
		
	}

}
