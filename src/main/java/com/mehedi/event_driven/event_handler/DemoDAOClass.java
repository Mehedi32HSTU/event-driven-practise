package com.mehedi.event_driven.event_handler;

public class DemoDAOClass {

	private String name;
	private String email;
	public DemoDAOClass() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "DemoDAOClass [name=" + name + ", email=" + email + "]";
	}
}
