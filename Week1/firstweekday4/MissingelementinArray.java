package firstweek4day;

import java.util.Arrays;

public class MissingelementinArray {

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,7,5,8};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
		   //System.out.println(arr[i]);
		   if(i+1!=arr[i])
		   {
			   System.out.println(i+1);
		   }
	        
		}

	}
}
