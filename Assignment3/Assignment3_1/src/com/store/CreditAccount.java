package com.store;

import java.util.Scanner;

public class CreditAccount {
	private int accountnumber;
	private double balancebegining;
	private double totalcharge;
	private double totalcredits;
	private double creditlimit;

	public CreditAccount() {
		this.accountnumber = 0;
		this.balancebegining = 0.0;
		this.totalcharge = 0.0;
		this.totalcredits = 0.0;
		this.creditlimit = 0.0;
	}

	public CreditAccount(int accountnumber, double balancebegining, double totalcharge, double totalcredits,
			double creditlimit) {

		this.accountnumber = accountnumber;
		this.balancebegining = balancebegining;
		this.totalcharge = totalcharge;
		this.totalcredits = totalcredits;
		this.creditlimit = creditlimit;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accountnumber");
		this.accountnumber = sc.nextInt();
		System.out.println("Enter the balance at the begining");
		this.balancebegining = sc.nextDouble();
		System.out.println("Enter the total charges");
		this.totalcharge = sc.nextDouble();
		System.out.println("Enter the total credits");
		this.totalcredits = sc.nextDouble();
		System.out.println("Enter the credit limit");
		this.creditlimit = sc.nextDouble();
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public double getBalancebegining() {
		return balancebegining;
	}

	public void setBalancebegining(double balancebegining) {
		this.balancebegining = balancebegining;
	}

	public double getTotalcharge() {
		return totalcharge;
	}

	public void setTotalcharge(double totalcharge) {
		this.totalcharge = totalcharge;
	}

	public double getTotalcredits() {
		return totalcredits;
	}

	public void setTotalcredits(double totalcredits) {
		this.totalcredits = totalcredits;
	}

	public double getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(double creditlimit) {
		this.creditlimit = creditlimit;
	}

	public double calculateNewBalance() {
		return balancebegining + totalcharge - totalcredits;
	}

	public boolean creditlimitexceeded() {
		return calculateNewBalance() > creditlimit;
	}
}
