package firstweekday5;

import java.util.Arrays;
import java.util.Iterator;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String name="madam";
		String rev="";
		for (int i =name.length()-1; i>=0; i--)
		  {
			name.charAt(i);
			rev=rev+name.charAt(i);
	          }
		
		    if(name.equalsIgnoreCase(rev))
		{
			System.out.println("It is a palindrome");
		}
		else 
			System.out.println("It is not a palindrome");
	}
	
}    

