package com.learning.ioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("Airtel constructor called");
	}
	
	public void calling() {
		System.out.println("Calling using Airtel Sim");
	}

	public void data() {
		System.out.println("Browsing internet using Airtel Sim");
	}

}
