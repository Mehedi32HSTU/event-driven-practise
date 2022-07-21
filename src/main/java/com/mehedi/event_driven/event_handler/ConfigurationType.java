package com.mehedi.event_driven.event_handler;

public enum ConfigurationType {
	ATTENDANCE_ROSTER(0),LEAVE_POLICY(1);
	
	private final int value;

	private ConfigurationType(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}

}
