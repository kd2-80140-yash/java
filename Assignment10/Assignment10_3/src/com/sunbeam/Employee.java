package com.sunbeam;


	import java.util.Scanner;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.ListIterator;
	import java.util.Comparator;

	class Employees {
	    private int id;
	    private String name;
	    private double salary;

	    public Employees() {
	        this.id = 0;
	        this.name = "";
	        this.salary = 0.0;
	    }

	    public Employees(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
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

	    public void accept() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter ID: ");
	        this.id = sc.nextInt();
	        sc.nextLine(); // Consume the newline character
	        System.out.print("Enter Name: ");
	        this.name = sc.nextLine();
	        System.out.print("Enter Salary: ");
	        this.salary = sc.nextDouble();
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Employee other = (Employee) obj;
	        return id == other.id;
	    }

	    @Override
	    public int hashCode() {
	        return Integer.hashCode(id);
	    }
	}

	public class Employee {
	    public static void main(String[] args) {
	        LinkedList<Employee> list = new LinkedList<>();
	        ListIterator<Employee> itr;
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Employee Management Menu:");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Delete Employee");
	            System.out.println("3. Find Employee by ID");
	            System.out.println("4. Sort Employees by ID");
	            System.out.println("5. Edit Employee");
	            System.out.println("6. Display All Employees");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    Employee newEmp = new Employee();
	                    newEmp.accept();
	                    list.add(newEmp);
	                    break;
	                case 2:
	                    System.out.print("Enter Employee ID to delete: ");
	                    int empIdToDelete = sc.nextInt();
	                    Employee empToDelete = new Employee();
	                    empToDelete.setId(empIdToDelete);
	                    if (list.remove(empToDelete)) {
	                        System.out.println("Employee with ID " + empIdToDelete + " deleted.");
	                    } else {
	                        System.out.println("Employee not found.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter Employee ID to find: ");
	                    int empIdToFind = sc.nextInt();
	                    Employee key = new Employee();
	                    key.setId(empIdToFind);
	                    int index = list.indexOf(key);
	                    if (index == -1)
	                        System.out.println("Employee not found.");
	                    else {
	                        Employee foundEmp = list.get(index);
	                        System.out.println("Employee Found: " + foundEmp);
	                    }
	                    break;
	                case 4:
	                    sortEmployeesByID(list);
	                    System.out.println("Employees sorted by ID.");
	                    break;
	                case 5:
	                    System.out.print("Enter Employee ID to edit: ");
	                    int empIdToEdit = sc.nextInt();
	                    Employee editKey = new Employee();
	                    editKey.setId(empIdToEdit);
	                    int editIndex = list.indexOf(editKey);
	                    if (editIndex == -1)
	                        System.out.println("Employee not found.");
	                    else {
	                        Employee oldEmp = list.get(editIndex);
	                        System.out.println("Employee Found: " + oldEmp);
	                        System.out.println("Enter new information for the Employee");
	                        Employee newEmp = new Employee();
	                        newEmp.accept();
	                        list.set(editIndex, newEmp);
	                        System.out.println("Employee information updated.");
	                    }
	                    break;
	                case 6:
	                    System.out.println("All Employees:");
	                    itr = list.listIterator();
	                    while (itr.hasNext()) {
	                        Employee emp = itr.next();
	                        System.out.println(emp);
	                    }
	                    break;
	                case 7:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        } while (choice != 7);
	    }

	    // Method to sort employees by ID
	    private static void sortEmployeesByID(LinkedList<Employee> employees) {
	        Collections.sort(employees, new Comparator<Employee>() {
	            @Override
	            public int compare(Employee e1, Employee e2) {
	                return Integer.compare(e1.getId(), e2.getId());
	            }
	        });
	    }

		
		}
	


