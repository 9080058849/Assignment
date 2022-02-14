package firstweekday5;

import java.util.Scanner;

public class LengthOfTheString 
{
	public static void main(String[] args) 
	{
		String str=new String("welcome to testleaf");
		Scanner in =new Scanner(System.in);
		System.out.println("enter the name");
		String name=in.nextLine();
	  int length=name.length();//length of the string;
	  System.out.println(length);
	 char[] charArray= name.toCharArray();//covert string to char
	 System.out.println(charArray);
	 System.out.println(name.charAt(5));//string index
	 System.out.println(name.contains("leaf"));
	 System.out.println(name.indexOf("l"));//checking index;
	 System.out.println(str.equalsIgnoreCase(name));//checking String if it equals
	 System.out.println(str==name);//it will check the string memory location 
	 System.out.println(str.toUpperCase());
	 System.out.println(str.toLowerCase());
	 
	 
	  
	}
}
