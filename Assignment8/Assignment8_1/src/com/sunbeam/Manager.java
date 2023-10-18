package com.sunbeam;

import java.util.Scanner;

class Manager extends Employee {
    protected float bonus;

    public Manager() {
        super();
        this.bonus = 0;
    }

    public Manager(int id, float sal, float bonus) {
        super(id, sal);
        this.bonus = bonus;
    }

    public float getBonus() {
        return this.bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bonus: ");
        this.bonus = scanner.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The bonus is: " + this.bonus);
    }

    @Override
    public float calculateTotalSalary() {
        return this.sal + this.bonus;
    }
}

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
