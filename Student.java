package week3.day1.assignment.org.student;

import week3.day1.assignment.org.department.Department;

public class Student extends Department{
	
    public void collegeDetails() {
		super.collegeName();
		super.collegeCode();
		super.collegeRank();
		super.departmentName();
		
    }

	public void studentName() {
		System.out.println("Student Name is Ihaan");
	}
	
	public void studentDept() {
		System.out.println("Student Department is Maths");
	}
	
	public void studentId() {
		System.out.println("Student ID is 786");
	}
}
