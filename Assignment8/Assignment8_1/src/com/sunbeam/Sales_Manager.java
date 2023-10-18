package com.sunbeam;

import java.util.Scanner;

class SalesManager extends Employee {
    protected float bonus;
    protected float comm;

    public SalesManager() {
        super();
        this.bonus = 0;
        this.comm = 0;
    }

    public SalesManager(int id, float sal, float bonus, float comm) {
        super(id, sal);
        this.bonus = bonus;
        this.comm = comm;
    }

    public float getBonus() {
        return this.bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
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
        System.out.print("Enter the bonus: ");
        this.bonus = scanner.nextFloat();
        System.out.print("Enter the commission: ");
        this.comm = scanner.nextFloat();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The bonus is: " + this.bonus);
        System.out.println("The commission is: " + this.comm);
    }

    @Override
    public float calculateTotalSalary() {
        return this.sal + this.bonus + this.comm;
    }
}