package com.sunbeam;

public class Box<T extends Employee>
{
	private T obj;
	public void set(T val) {
		this.obj = val;
	}
	public T getId() {
		return this.obj;
	}	
	public float getTotalSalary()
	{
		return  obj.calculateTotalSalary();
	}
	
	public static void main(String[] args) {
	    Box<Manager> b1 = new Box<>();
	    Manager manager = new Manager();
	    System.out.println("Enter manager details ");
	    manager.accept();
	    b1.set(manager);

	    System.out.println("Manager's ID: " + b1.getId());
	    System.out.println("Manager's Total Salary: " + b1.getTotalSalary());
	    
	    Box<Salesman> b2 = new Box<>();
	    Salesman salesman = new Salesman();
	    System.out.println("Enter salesman details ");
	    salesman.accept();
	    b2.set(salesman);

	    System.out.println("Salesman's ID: " + b2.getId());
	    System.out.println("Salesman's Total Salary: " + b2.getTotalSalary());
	}
}