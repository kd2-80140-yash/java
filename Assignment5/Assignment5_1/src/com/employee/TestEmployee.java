package com.employee;

	import java.util.Scanner;

	public class TestEmployee {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose the type of employee:");
	        System.out.println("1. Commission Employee");
	        System.out.println("2. Hourly Employee");
	        System.out.println("3. Salaried Employee");
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        Employee employee = null;

	        switch (choice) {
	            case 1:
	                employee = new Commission_Employee();
	                break;
	            case 2:
	                employee = new Hourly_Employee();
	                break;
	            case 3:
	                employee = new Salaried_Employee();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                return;
	        }

	        employee.acceptEmployee();
	        employee.TotalCommission();
	        employee.displayEmployee();

	        scanner.close();
	    }
	}


