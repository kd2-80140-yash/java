package com.sunbeam;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class LibraryBook
{
	private String isbn;
	private String authorName;
	private double price;
	private int quantity;
	
	public LibraryBook()
	{
		this.isbn = "";
        this.price = 0.0;
        this.authorName = "";
        this.quantity = 0;
	}

	public LibraryBook(String isbn, String authorName, double price, int quantity) {
		super();
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
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        LibraryBook other = (LibraryBook) obj;
        return isbn.equals(other.isbn);
    }
	@Override
    public int hashCode() {
        return isbn.hashCode();
    }
	
	
}
public class Library
{
	public static void main(String[] args)
	{
		List<LibraryBook>list = new ArrayList<>();
		ListIterator<LibraryBook>itr;
		Scanner sc = new Scanner(System.in);
		LibraryBook b;
		int choice = 0;
		
		do {
			
			System.out.println("Library Menu:");
            System.out.println("1. Add new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search a book by ISBN");
            System.out.println("4. Delete a book by index");
            System.out.println("5. Delete a book by ISBN");
            System.out.println("6. Reverse the list");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int index;
            
            switch(choice)
            {
            case 1:
            	b = new LibraryBook();
            	b.accept();
            	if(list.contains(b))
            	{
            		index = list.indexOf(b);
            		LibraryBook e = list.get(index);
            		e.setQuantity(e.getQuantity()+1);
            	}
            	else
            	{
            		list.add(b);
            	}
            	break;
            case 2:
            	System.out.println("Forward Display");
            	itr = list.listIterator();
            	while(itr.hasNext())
            	{
            		b = itr.next();
            		System.out.println(b);
            	}
            	break;
            case 3:
            	System.out.println("Enter ISBN of book to find :");
            	String isbnfind = sc.next();
            	LibraryBook key = new LibraryBook();
            	key.setIsbn(isbnfind);
            	index = list.indexOf(key);
            	if(index ==-1)
            	{
            		System.out.println("Book not found");
            	}
            	else
            	{
            		System.out.println("Book found at index: "+index);
            		b = list.get(index);
            		System.out.println(b);
            	}
            	break;
            case 4:
            	System.out.println("Enter Index of book to delete :");
            	index = sc.nextInt();
            	if(index >=0 && index<list.size())
            	{
            		list.remove(index);
            	}
            	else
            	{
            		System.out.println("Invalid choice");
            	}
            	break;
            case 5:
            	System.out.println("Enter ISBN of book to delete : ");
            	String isbnToDelete = sc.next();
            	LibraryBook booktoDelete = new LibraryBook();
            	booktoDelete.setIsbn(isbnToDelete);
            	if(list.remove(booktoDelete))
            	{
            		System.out.println("Book with ISBN"+isbnToDelete+"has been deleted");
            	}
            	else
            	{
            		System.out.println("Book with ISBN "+isbnToDelete+"not found,no book deleted");
            	}
            	break;
            case 6:
            	Collections.reverse(list);
            	System.out.println("List reversed");
            	break;
            }
			
			
		} while (choice !=0);
	}
}
