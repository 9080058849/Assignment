package firstweek3day;

public class Calculator 
{     
	public void multipleTwoNumbers(double a,double b)
	{
		double c=a*b;
		System.out.println(c);
	}
	public void divideTwoNumbers(float e,float f)
	{
		float g=e/f;
		System.out.println(g);
	}
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		cal.multipleTwoNumbers(10.23,11.20);
		cal.divideTwoNumbers(12.5f,2.2f);
	}

}
