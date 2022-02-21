package org.department;

public class Sports 
{
	public void Achiever(String name,int metalCount)
	{
		System.out.println("The player name and metal count:"+name+" "+metalCount);
	}
	public void Achiever(String country,String sportname,int rank)
	{
		System.out.println("The country and Sports name and its rank:"+country+" "+sportname+""+rank);
	}
	public void Achiever(float weight,double height,long contactnumber)
	{
		System.out.println("The weight,height and contact number of player:"+weight+" "+height+" "+contactnumber);
		
	}
	
	public void Achiever(String tournamentname,double prizemoney)
	{
		System.out.println("The tournament name and prizemoney:"+tournamentname+" "+prizemoney);
	}
	public static void main(String[] args) 
	{
		Sports sport=new Sports();
		sport.Achiever("jeo",30);
		sport.Achiever("India", "Volleyball",1);
		sport.Achiever(80, 5.9, 9090903210l);
		sport.Achiever("Statelevel tournament",50000.000);
	    
	}

}
