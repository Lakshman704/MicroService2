package com.example.service2;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	@Autowired
	Employee emp;
	@GET
	@RequestMapping(value = "/rest1",produces = "application/json")
	public Employee getData() {
		
		emp.setEmpId(10);
		emp.setName("service2");
		return emp;
	}
}
