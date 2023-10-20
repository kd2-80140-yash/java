package com.sunbeam;

import java.util.Scanner;

public class ArithMain {
	

    static void calculate(double num1, double num2, Arithmetic op) {
        double result = op.calc(num1, num2);
        System.out.println("Result: " + result);
	
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		int choice;
		
		System.out.println("Enter the first number");
		num1 = sc.nextDouble();
		
		System.out.println("Enter the second number");
		num2 = sc.nextDouble();
		
		
		
		do 
		
		{
			System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            
            switch(choice)
            {
            case 1:
            	calculate(num1,num2, (a,b) -> a + b);
            	break;
            case 2:
            	calculate(num1,num2,(a,b) ->a-b);
            	break;
            case 3:
            	calculate(num1,num2,(a,b) -> a*b);
            	break;
            case 4:
            	calculate(num1,num2,(a,b) -> a/b);
            	break;
            default:
            	System.out.println("Invalid choice");
            	break;
            	
            }
           
			
	          } while (choice !=0);
		
	}

}
