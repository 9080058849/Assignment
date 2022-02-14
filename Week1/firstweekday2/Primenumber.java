package firstweek2day;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args)
	{
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the starting number:");
		a=in.nextInt();
		System.out.println("enter the ending number:");
		b=in.nextInt();
	    for(int i=a;i<=b;i++)
	    {   int count=0;
	    	for(int j=1;j<=i;j++) {
	    		if(i%j==0) {
	    		count=count+1;
	            System.out.println("it is"+j+" a prime number");
	    		}
	    	else
	    		System.out.println("it is"+j+" not a prime number");
	    	}
	    }
	    
	
	}
}

