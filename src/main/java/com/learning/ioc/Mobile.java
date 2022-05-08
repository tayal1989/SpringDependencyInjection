package com.learning.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
//		Jio jio = new Jio();
//		jio.calling();
//		jio.data();
//		
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
//		
//		// But we should use best practises
//		Sim simJio = new Jio();
//		simJio.calling();
//		simJio.data();
//		
//		Sim simAirtel = new Airtel();
//		simAirtel.calling();
//		simAirtel.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("Config Loaded...");
		
//		Jio jio = (Jio) context.getBean("jio");
//		jio.calling();
//		jio.data();
//		
//		Airtel airtel = context.getBean("airtel", Airtel.class);
//		airtel.calling();
//		airtel.data();
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
