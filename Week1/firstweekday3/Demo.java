package firstweek3day;

import java.util.Scanner;

public class Demo 
{
	public void addtwonumber(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Demo de=new Demo();
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number:");
		int first=in.nextInt();
		System.out.println("enter the number:");
		int second=in.nextInt();
		de.addtwonumber(first, second);
	}

}
