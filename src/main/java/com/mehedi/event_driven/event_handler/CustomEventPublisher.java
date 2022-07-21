package com.mehedi.event_driven.event_handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomEventPublisher {
	@Autowired
    private ApplicationEventPublisher applicationEventPublisher;
	
	@GetMapping("/")
	public String getStarted() {
		return "Hello World";
	}
	
	@GetMapping("/trigger")
	public String trigger() {
		System.out.println("Trigerring method called.");
		triggerEvent();
		return "Event Triggered.";
	}
	
	public void triggerEvent() {
		DemoDAOClass demoDAOClass = new DemoDAOClass();
		demoDAOClass.setEmail("abc@gmail.com");
		demoDAOClass.setName("Mehedi Hasan");
		List<Long>employeeId = new ArrayList<>();
		employeeId.add(1234L);
		employeeId.add(2345L);
		employeeId.add(3456L);
		CustomSpringEvent customSpringEvent = new CustomSpringEvent(employeeId, demoDAOClass, ConfigurationType.ATTENDANCE_ROSTER, "Hello World");
		applicationEventPublisher.publishEvent(customSpringEvent);
	}
}
