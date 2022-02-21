package org.department;

public class Student extends Department
{
	public void studentName(String name)
	{
		System.out.println("The student name:"+name);
	}
	public void studentDepartment(String department)
	{
		System.out.println("The Department name:"+department);
	}
	public void studentId(int id)
	{
		System.out.println("The Student id:"+id);
		
	}
	public static void main(String[] args) 
	{
		Student student=new Student();
		student.collegeName("K.S.R");
		student.collegeCode(25381);
		student.collegeRank("A");
		student.departmentName("Computer Science and Engineering");
		student.studentName("joe");
		student.departmentName("Computer Science");
		student.studentId(20);
		
	}

}
