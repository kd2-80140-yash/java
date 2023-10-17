package com.store;

public class TestCreditLimit
{

	public static void main(String[] args) 
	{
		
		CreditAccount customerAccount = new CreditAccount();
		
		customerAccount.acceptData();
		
		 double newbalance = customerAccount.calculateNewBalance();
		
		System.out.println("New balance is"+newbalance);
		
		if (customerAccount.creditlimitexceeded()) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Credit limit not exceeded");
        }
	}

}
