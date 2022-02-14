package firstweek3day;

import java.util.Scanner;

public class LocalGlobalvariable 
{
	int a,b,c,d=10;     //(argument method)
	public void addtwonum(int a,int b)
	{
		//int a=10;
		//int b=20;
		c=a+b;
		System.out.println(c);
	}
	public void subtwonum(int a,int b)
	{
		//int a=10;
		//int b=5;
		c=a-b;
		System.out.println(c);
	}
	public void multwonum(int a ,int b)
	{
		//int a=10;
		//int b=2;
		c=a*b;
		System.out.println(c);
	}
   public static void main(String[] args) 
   {
	LocalGlobalvariable la=new LocalGlobalvariable();
    la.addtwonum(5,10);//(argument passing for the data type as a value)
	la.subtwonum(10,5);
	la.multwonum(3,2);
	System.out.println(la.d);
   }
}
