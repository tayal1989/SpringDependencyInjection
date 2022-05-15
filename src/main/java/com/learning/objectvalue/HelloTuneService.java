package com.learning.objectvalue;

public class HelloTuneService implements Service {
	
	public HelloTuneService() {
		System.out.println("Hello tune service class constructor called");
	}
	
	public void service() {
		System.out.println("Hello tune service activated!!!");
	}
}
