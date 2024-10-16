package com.learn.SimpleProject.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
public class ConnectionController 
{
	@GetMapping("makeConnection")
	public String makeConnection()
	{
		System.out.println("dkjbffd");
		return "Connection is established";
		
		
	}
}
