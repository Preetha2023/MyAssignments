package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("student Name");
	}
	
	public void studentDept()
	{
		System.out.println("dept");
	}
public void studentId()

{
	System.out.println("studentid");
}
public static void main (String[] args)
{
	Student obj= new Student();
	
	obj.studentDept();
	obj.studentId();
	obj.studentName();
	obj.deptName();
	obj.collegeCode();
	obj.collegeName();
	obj.collegeRank();
}
}
