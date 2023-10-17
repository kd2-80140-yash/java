package com.sunbeam.date;

public class DateTest {

	public static void main(String[] args) 
	{
		Date date = new Date(10,12,2018);
		
		System.out.print("Date: ");
        date.displayDate();
        
        date.setDay(15);
        date.setMonth(8);
        date.setYear(1947);
        
        System.out.print("Updated Date: ");
        date.displayDate();
	}

}
