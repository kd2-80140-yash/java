package com.sunbeam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapMain {
	static int menu(Scanner scan) {
		int choice;

		System.out.println("0. EXIT");
		System.out.println("1. ADD STUDENT");
		System.out.println("2. FIND STUDENT");
		System.out.println();
		System.out.println("Enter Your Choice....");
		choice = scan.nextInt();

		return choice;
	}

public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	Map<Integer,Student> map = new LinkedHashMap<>();
	
	int choice;
	
	while((choice = menu(sc)) != 0)
	{
		switch(choice)
		{
		case 1:
			System.out.print("Enter Rollno : ");
			int rollno = sc.nextInt();
			System.out.print("Enter Name : ");
			String name = sc.next();
			System.out.print("Enter Marks : ");
			double marks = sc.nextDouble();
			
			Student s = new Student(rollno,name,marks);
			map.put(s.getRollno(), s);
			break;
			
		case 2:
			System.out.println("Enter the roll no to find");
			rollno = sc.nextInt();
			Student s2 = map.get(rollno);
			System.out.println("The Student with Rollno : " + rollno + " is " + s2);
			break;
		
		}
	}
	
	
}

}