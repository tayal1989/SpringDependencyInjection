package com.learning.literalvalue;

public class Student {
	// Injecting literal value
	private String studentName;
	private int id;
	
	//Injecting constructor
	private String boardExam;
	private float fees;
	
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	public Student(String boardExam, float fees) {
		this.boardExam = boardExam;
		this.fees = fees;
	}
	
	public Student(String studentName, int id, String boardExam, float fees) {
		this.studentName = studentName;
		this.id = id;
		this.boardExam = boardExam;
		this.fees = fees;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBoardExam() {
		return boardExam;
	}

	public float getFees() {
		return fees;
	}

}
