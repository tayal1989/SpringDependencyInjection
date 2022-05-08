package com.learning.ioc;

public class Jio implements Sim {
	
	public Jio() {
		System.out.println("Jio constructor called");
	}

	public void calling() {
		System.out.println("Calling using Jio Sim");
	}

	public void data() {
		System.out.println("Browsing internet using Jio Sim");
	}

}
