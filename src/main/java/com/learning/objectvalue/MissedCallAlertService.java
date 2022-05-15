package com.learning.objectvalue;

public class MissedCallAlertService implements Service {
	
	public MissedCallAlertService() {
		System.out.println("Missed call service class constructor called");
	}
	
	public void service() {
		System.out.println("Missed call service activated!!!");
	}
}
