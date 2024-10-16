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
		System.out.println("Example 1");
		return "Connection is established";
		
		
	}
}
