package com.learning.learningvaluesrequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
