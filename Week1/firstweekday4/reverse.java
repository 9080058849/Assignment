package firstweek4day;

import java.util.Arrays;

public class reverse 
{
	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50,60,70};
		Arrays.sort(a);//it is used to get the ascending order.
		for(int i=a.length-1;i>=0;i--)//in array we can reverse the numbers using a for loop;
		{
		   System.out.println(a[i]);
		}
	}

}
