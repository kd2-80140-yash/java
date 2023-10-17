package com.employee;

import java.util.Scanner;

public class Hourly_Employee extends Employee {
    private double wages;
    private int hours;
	private double commission;

    public Hourly_Employee() {
        this.wages = 0.0;
        this.hours = 0;
    }

    public Hourly_Employee(double wages, int hours, String firstname, String lastname, int ssn) {
        super(firstname, lastname, ssn);
        this.wages = wages;
        this.hours = hours;
    }

    @Override
    public void TotalCommission() {
        if (this.hours <= 40) {
            this.commission = this.wages * this.hours;
        } else if (this.hours > 40) {
            this.commission = 40 * this.wages + (this.hours - 40) * this.wages * 1.5;
        }
    }

    @Override
    public void acceptEmployee() {
        Scanner sc = new Scanner(System.in);
        super.acceptEmployee();
        System.out.println("Enter the wages");
        this.wages = sc.nextDouble();
        System.out.println("Enter the hours");
        this.hours = sc.nextInt();
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("the wages = " + this.wages);
        System.out.println("the hours = " + this.hours);
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
