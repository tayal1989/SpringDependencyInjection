package com.learning.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	/*
	 * Autowired doesn't need a setter to do the dependency injection.
	 */
	
	public Human() {
		System.out.println("By default constructor");
	}
	
//	Learning autowired through constructor	
//	@Autowired
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human constructor is being called which has heart has argument");
	}

//	Learning autowired through setter function
//	@Autowired
//	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called");
	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("Name of animal : " + heart.getNameOfAnimal());
			System.out.println("No of heart present : " + heart.getNoOfHearts());
		} else {
			System.out.println("You are dead");
		}
	}

}
