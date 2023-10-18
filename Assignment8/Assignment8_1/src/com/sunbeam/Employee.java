package com.sunbeam;

import java.util.Scanner;

abstract class Employee {
    protected int id;
    protected float sal;

    public Employee() {
        this.id = 0;
        this.sal = 0;
    }

    public Employee(int id, float sal) {
        this.id = id;
        this.sal = sal;
    }

    public int getId() {
        return this.id;
    }

    public float getSal() {
        return this.sal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the id: ");
        this.id = scanner.nextInt();
        System.out.print("Enter the sal: ");
        this.sal = scanner.nextFloat();
    }

    public void display() {
        System.out.println("id = " + this.id);
        System.out.println("sal = " + this.sal);
    }

     abstract float calculateTotalSalary();
}
