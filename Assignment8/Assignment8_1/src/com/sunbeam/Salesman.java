package com.sunbeam;

import java.util.Scanner;

class Salesman extends Employee {
    protected float comm;

    public Salesman() {
        super();
        this.comm = 0;
    }

    public Salesman(int id, float sal, float comm) {
        super(id, sal);
        this.comm = comm;
    }

    public float getComm() {
        return this.comm;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the commission: ");
        this.comm = scanner.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The commission is: " + this.comm);
    }

    @Override
    public float calculateTotalSalary() {
        return this.sal + this.comm;
    }
}
