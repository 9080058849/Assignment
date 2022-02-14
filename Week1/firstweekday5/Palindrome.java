package firstweekday5;

import java.util.Arrays;
import java.util.Iterator;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String name="madam";
		String reva="";
		//int val=name.length();
		char[] reverse=name.toCharArray();
		/*for(int i=val-1;i>=0;i--) {
			System.out.println(val[0]);
		}*/
		for (int i =reverse.length-1; i>=0; i--) {
			String rev=reverse.toString();
			}
		    System.out.print(reverse);
		    if(name.equalsIgnoreCase(rev))
		{
			System.out.println("It is a palindrome");
		}
		else 
			System.out.println("It is not a palindrome");
	}
}    

