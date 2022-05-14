package com.learning.literalvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		
		Student student = context.getBean("student", Student.class);
		System.out.println("Student name is : " + student.getStudentName() + " and id is : " + student.getId());
		System.out.println("Student Board Exam is : " + student.getBoardExam() + " and fees is : " + student.getFees());
		
		Student student1 = context.getBean("student1", Student.class);
		System.out.println("Student name is : " + student1.getStudentName() + " and id is : " + student1.getId());
		System.out.println("Student Board Exam is : " + student1.getBoardExam() + " and fees is : " + student1.getFees());
		
		Student completeStudent = context.getBean("completeStudent", Student.class);
		System.out.println("Student name is : " + completeStudent.getStudentName() + " and id is : " + completeStudent.getId());
		System.out.println("Student Board Exam is : " + completeStudent.getBoardExam() + " and fees is : " + completeStudent.getFees());
		
		Student incompleteStudent = context.getBean("incompleteStudent", Student.class);
		System.out.println("Student name is : " + incompleteStudent.getStudentName());
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
