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
		return "Connection is established";
		
	}
}
