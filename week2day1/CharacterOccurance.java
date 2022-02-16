package week2Day2;

public class CharacterOccurance 
{
	public static void main(String[] args) 
	{
		String text="welcome to chennai";
		String replace=text.replace("e","");
		System.out.println(text.length()-replace.length());
	}
}
