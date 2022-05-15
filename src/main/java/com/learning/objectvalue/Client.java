package com.learning.objectvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("beans.xml file loaded");
		Airtel airtel = context.getBean("airtel", Airtel.class);
		airtel.activateService();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
