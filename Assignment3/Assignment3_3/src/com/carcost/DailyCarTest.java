package com.carcost;

public class DailyCarTest 
{

	public static void main(String[] args) 
	{
		Dailycar d1 = new Dailycar();
		
		d1.acceptData();
	
	    
	    double cost = d1.Calculatedailycost();
	    
	    System.out.println("The total cost is = "+cost);
		
		
	}

}
