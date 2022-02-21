package org.department;

public class Pc extends Laptop
{
	public void getSystemInf(String info)
	{
		System.out.println("The system info is:"+info);
	}

	public static void main(String[] args) 
	{
		Pc computer=new Pc();
		computer.getSystemInfo("MAC");
	}

}
