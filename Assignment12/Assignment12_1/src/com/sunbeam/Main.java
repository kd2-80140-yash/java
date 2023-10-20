package com.sunbeam;

public class Main 
{
public static void main(String[] args) {
		
		Employee arr[] = new Employee[3];
		arr[0] = new Manager(1000,100);
		System.out.println("Basic Salary : " + arr[0].getSal() + ", Incetives applied : " + arr[0].calcIncentives());
		
		arr[1] = new Labor(40,70);
		System.out.println("Basic Salary : " + arr[1].getSal() + ", Incetives applied : " + arr[1].calcIncentives());
	
		arr[2] = new Clerk(1000);
		System.out.println("Basic Salary : " + arr[2].getSal() + ", Incetives applied : " + arr[2].calcIncentives());
	
		double res = Employee.calcTotalIncome(arr);
		
		System.out.println("The Total Salary for all Employees is : " + res);
		
	}

}
