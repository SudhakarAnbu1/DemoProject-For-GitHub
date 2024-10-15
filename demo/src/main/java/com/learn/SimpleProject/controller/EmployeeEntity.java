package com.learn.SimpleProject.controller;

public class EmployeeEntity {
	String e_name;
	String e_email;
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_email() {
		return e_email;
	}
	public void setE_email(String e_email) {
		this.e_email = e_email;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [e_name=" + e_name + ", e_email=" + e_email + "]";
	}
	
	
	
	
}
