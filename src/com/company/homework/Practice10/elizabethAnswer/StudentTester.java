package com.company.homework.Practice10.elizabethAnswer;

public class StudentTester {

	public static void main(String[] args) 
	{
		Course java = new Course(100, "Java", 5);
		Course infi = new Course(200, "Infi", 5);
		Course algebra = new Course(333, "Algebra", 5);
		
		Student dana = new Student("Dana", 123456);
		dana.addCourse(java);
		dana.addCourse(infi);
		dana.addCourse(algebra);
		
		dana.updateGrade(100, 100);
		dana.updateGrade(333, 88);
		
		System.out.println(dana);
		System.out.println(dana.getGradesAverage());
	}
}