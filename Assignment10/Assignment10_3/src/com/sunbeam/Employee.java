package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee() {
		this.empid = 0;
		this.name = "";
		this.salary = 0.0;
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter the Emp Id : ");
		this.empid = sc.nextInt();
		System.out.println("Enter the Emp Name : ");
		this.name = sc.next();
		System.out.println("Enter the Emp Salary : ");
		this.salary = sc.nextDouble();
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
			if (this.empid == emp.empid) 
				return true;
			else 
				return false;
			
		} else 
			return false;

	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}