import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int a=0,b=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value:");
		int e=in.nextInt();
		System.out.println(a);
		System.out.println(b);
		int sum=0;
		for(int i=1;i<=e;i++)
		{
			sum=a+b;//first sum the two number and store in the sum variable.
			a=b;//now assign the value a to b 
			b=sum;//now assign b to sum
			System.out.println(sum);
		}
		
	}
}
