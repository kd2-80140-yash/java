package com.sunbeam;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable 
{
	private String isbn;
	private String authorName;
	private double price;
	private int quantity;
	
	public Book()
	{
		this.isbn = "";
        this.price = 0.0;
        this.authorName = "";
        this.quantity = 0;
	}

	public Book(String isbn, String authorName, double price, int quantity) {
		
		this.isbn = isbn;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ISBN");
        this.isbn = sc.next();
        System.out.println("Enter the price");
        this.price = sc.nextDouble();
        System.out.println("Enter the author name");
        this.authorName = sc.next();
        System.out.println("Enter the quantity");
        this.quantity = sc.nextInt();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ISBN: " + isbn + ", Price: " + price + ", Author: " + authorName + ", Quantity: " + quantity;
	}
}


