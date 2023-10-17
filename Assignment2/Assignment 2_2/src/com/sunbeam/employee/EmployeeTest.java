package com.sunbeam.employee;

public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		
		Employee employee1 = new Employee("John", "Doe", 5000.0);
        Employee employee2 = new Employee("Jane", "Smith", 6000.0);
        
        displayYearlySalary(employee1);
        displayYearlySalary(employee2);
        
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        System.out.println("After a 10% raise:");


        displayYearlySalary(employee1);
        displayYearlySalary(employee2);
    }
	public static void displayYearlySalary(Employee employee) {
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Yearly Salary: Rs." + employee.getYearlySalary());
        System.out.println();
    }

	
}   
