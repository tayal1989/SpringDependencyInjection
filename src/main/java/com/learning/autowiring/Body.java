package com.learning.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("beans.xml file loaded");
		Human human = context.getBean("human", Human.class);
		human.startPumping();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
