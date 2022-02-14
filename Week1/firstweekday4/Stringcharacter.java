package firstweek4day;

public class Stringcharacter 
{
	public static void main(String[] args) 
	{
		String text="Testleaf";
											   // it is a type conversion string to char
	     char [] chararray=text.toCharArray();//used to print a list of character in a one by one 
	     for(int i=0;i<text.length();i++)
	     {
	    	 System.out.println(chararray[i]);
	     }
		
	}
}
