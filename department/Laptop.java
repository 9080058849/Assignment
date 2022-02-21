package org.department;

public class Laptop 
{
	public void getSystemInfo(String systeminfo)
	{
		System.out.println("The system info:"+systeminfo);
	}
	public static void main(String[] args) 
	{
		Laptop lap=new Laptop();
		lap.getSystemInfo("Windows 10");
		
	}

}
