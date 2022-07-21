package com.mehedi.event_driven.event_handler;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListenerHandle {
	@EventListener
	public void customEventListener(CustomSpringEvent event) {
		System.out.println("Listener Called. Start here.");
		System.out.println("Source Object : "+ event.getSource().toString());
		System.out.println("Source Employee : "+ event.employeeId);
		System.out.println("Source Message : "+ event.getMessage());
		System.out.println("Source Configuration Type : "+ event.getConfigurationType());
		System.out.println("Source Demo Class : "+ event.getDemoDAOClass().toString());
		System.out.println("Listener Called. Finished here.");
	}

}
