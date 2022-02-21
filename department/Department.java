package org.department;

public class Department extends College
{
	public void departmentName(String departmentName)
	{
		System.out.println("The DepartmentName given as:"+departmentName);
	}
	public static void main(String[] args) 
	{
		Department dep=new Department();
		dep.departmentName("Computer Science and Engineering");
		
	}
}
