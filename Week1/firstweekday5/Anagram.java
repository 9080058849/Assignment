package firstweekday5;

public class Anagram 
{
  public static void main(String[] args) 
  {
	String text1="stops";
	String text2="potss";
	if(text1.equals(text2))
	{
		System.out.println("it same");
	}else
		System.out.println("not same");
	if(text1.length()==text2.length())
	{
		System.out.println("true");
	}
	else
		System.out.println("false");
	char arr1[]=text1.toCharArray();
	char arr2[]=text2.toCharArray();
	
	
  }
}
