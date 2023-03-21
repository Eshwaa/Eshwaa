package org.student;

import org.department.Department;

public class Student extends Department {
	public void studenteName() {
		System.out.println("studenteName:Eshwaa");	
	}
	public void studentDept() {
		System.out.println("studentDept:CSE");	
	}
	public void studentId() {
		System.out.println("studentId:610518104301");	
	}

	public static void main(String[] args) {
		Student clg = new Student();
		clg.collegeName();
		clg.collegeCode();
		clg.collegeRank();
		clg.deptName();
		clg.studenteName();
		clg.studentDept();
		clg.studentId();
		 
	}

}
