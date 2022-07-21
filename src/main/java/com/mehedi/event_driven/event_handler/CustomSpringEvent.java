package com.mehedi.event_driven.event_handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEvent;

public class CustomSpringEvent extends ApplicationEvent{
	private ConfigurationType configurationType;
	private String message;
	List<Long> employeeId;
	DemoDAOClass demoDAOClass;

	public CustomSpringEvent(List<Long>employeeId,Object source,ConfigurationType configurationType,
			String message) {
//		super(demoDAOClass);
		super(source);
		this.employeeId = employeeId;
		this.configurationType = configurationType;
		this.message = message;
		this.demoDAOClass = (DemoDAOClass) source;
//		this.demoDAOClass = demoDAOClass;
	}

	public ConfigurationType getConfigurationType() {
		return configurationType;
	}

	public String getMessage() {
		return message;
	}

	public List<Long> getEmployeeId() {
		return employeeId;
	}

	public DemoDAOClass getDemoDAOClass() {
		return demoDAOClass;
	}
	
}
