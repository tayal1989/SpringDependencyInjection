package com.learning.learningvaluesrequired;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.interested.course}")
	private String interestedCourse;
	
	@Value("${student.hobby}")
	private String hobby;
	
	public void displayStudentInfo() {
		System.out.println("Student Name : " + name);
		System.out.println("Interested Course Name : " + interestedCourse);
		System.out.println("Hobby Name : " + hobby);
	}
}
