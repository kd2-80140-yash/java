package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Solution2Main 
{
	private static void saveBooksToFile() 
	{
		try(FileOutputStream fout = new FileOutputStream("books.txt"))
				{
			       try(ObjectOutputStream oout = new ObjectOutputStream(fout))
			       {
			    	   oout.writeObject(list);
			       }//oout.close();
				}//fout.close();
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Books saved");
			
		
	}
	private static void loadBooksFromFile()
	{
		List<Book>list;
		try(FileInputStream fin = new FileInputStream("books.txt"))
		{
			try(ObjectInputStream oin = new ObjectInputStream(fin)) 
			{
				list = (List<Book>)oin.readObject();
				list.forEach(b->System.out.println(b));
			}
		}//fin.close();
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
    


public static void main(String[] args)
{
	List<Book>list = new ArrayList<>();
	ListIterator<Book>itr;
	Scanner sc = new Scanner(System.in);
	Book b;
	int choice = 0;
	
	
	
	
	
	
	do {
		
		System.out.println("Library Menu:");
        System.out.println("1. Add new book");
        System.out.println("2. Display all books");
        System.out.println("3. Search a book by ISBN");
        System.out.println("4. Delete a book by index");
        System.out.println("5. Delete a book by ISBN");
        System.out.println("6. Reverse the list");
        System.out.println("7.Enter the file name to save books : ");
    	System.out.println("8.Enter the file name to load books :");
        
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        int index;
        
        switch(choice)
        {
        case 1:
        	b = new Book();
        	b.accept();
        	if(list.contains(b))
        	{
        		index = list.indexOf(b);
        		Book e = list.get(index);
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
        	Book key = new Book();
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
        	Book booktoDelete = new Book();
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
        	
        case 7:
        	System.out.println("Enter the file name to save books : ");
        	String saveFileName = sc.next();
        	saveBooksToFile();
        	break;
        	
        case 8:
        	System.out.println("Enter the file name to load books :");
        	String loadFileName = sc.next();
        	 loadBooksFromFile();
        	break;
        }
		
		
	} while (choice !=0);
}















}


