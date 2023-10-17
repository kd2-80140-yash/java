
package com.employee;

import java.util.Scanner;

abstract public class Employee
 {
   private String firstname;
   private String lastname;
   private int ssn;
   
   public Employee()
   {
	   this.firstname = "";
	   this.lastname = "";
	   this.ssn = 0;
   }

public Employee(String firstname, String lastname, int ssn)
{
	
	this.firstname = firstname;
	this.lastname = lastname;
	this.ssn = ssn;
}
public void acceptEmployee()
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the firstname");
	this.firstname = sc.next();
	System.out.println("Enter the lastname");
	this.lastname = sc.next();
    System.out.println("Enter the ssn");
    this.ssn = sc.nextInt();
}
public void displayEmployee()
{
	System.out.println("The firstname is "+this.firstname);
	System.out.println("The lastname is"+this.lastname);
	System.out.println("The ssn is "+this.ssn);
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public int getSsn() {
	return ssn;
}

public void setSsn(int ssn) {
	this.ssn = ssn;
}
abstract public void TotalCommission();

   
   
}
