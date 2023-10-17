package com.employee;

import java.util.Scanner;

public class Salaried_Employee extends Employee
{
  private int weeklysalary;
  
  public Salaried_Employee()
  {
	  this.weeklysalary = 0;
  }

public Salaried_Employee(int weeklysalary,String firstname,String lastname,int ssn) 
{
	super(firstname,lastname,ssn);
	this.weeklysalary = weeklysalary;
}

@Override
public void TotalCommission() 
{
	
	
}

@Override
public void acceptEmployee()
{
	Scanner sc = new Scanner(System.in);
	super.acceptEmployee();
	System.out.println("Enter the weekly salary");
	this.weeklysalary = sc.nextInt();
}

@Override
public void displayEmployee() 
{
  super.displayEmployee();
  System.out.println("The weekly salary is = "+this.weeklysalary);
}

public int getWeeklysalary() {
	return weeklysalary;
}

public void setWeeklysalary(int weeklysalary) {
	this.weeklysalary = weeklysalary;
}



  
}
