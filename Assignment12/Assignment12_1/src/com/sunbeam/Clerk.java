package com.sunbeam;

public class Clerk implements Employee
{
private int salary;
	
	
	public Clerk(int salary) {
		this.salary = salary;
	}

	
	public double getSal() {
		return salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}
}
