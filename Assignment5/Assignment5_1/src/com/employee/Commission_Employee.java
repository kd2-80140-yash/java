package com.employee;

import java.util.Scanner;

public class Commission_Employee extends Employee
{
  private double grossrate;
  private double commissionrate;
  private double commission;
  
  public Commission_Employee()
  {
	  this.grossrate = 0.0;
	  this.commissionrate = 0.0;
	  this.commission = 0.0;
	  
  }

public Commission_Employee(double grossrate, double commissionrate,String firstname,String lastname,int ssn)
{
	super(firstname,lastname,ssn);
	this.grossrate = grossrate;
	this.commissionrate = commissionrate;
}

@Override
public void TotalCommission() 
{
	this.commission =this.commissionrate*this.grossrate;
}

@Override

public void acceptEmployee()
{
	Scanner sc = new Scanner(System.in);
	super.acceptEmployee();
	System.out.println("Enter the commission rate ");
	this.commissionrate = sc.nextDouble();
	System.out.println("Enter the gross rate");
	this.grossrate = sc.nextDouble();
}

@Override
public void displayEmployee() 
{
	super.displayEmployee();
	System.out.println("The commission rate is = "+this.commissionrate);
	System.out.println("The gross rate is ="+this.grossrate);
}

public double getGrossrate() {
	return grossrate;
}

public void setGrossrate(double grossrate) {
	this.grossrate = grossrate;
}

public double getCommissionrate() {
	return commissionrate;
}

public void setCommissionrate(double commissionrate) {
	this.commissionrate = commissionrate;
}

public double getCommission() {
	return commission;
}

public void setCommission(double commission) {
	this.commission = commission;
}



  
}
