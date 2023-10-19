package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) 
	{
		class Compareisbn implements Comparator<Book>
		{

			@Override
			public int compare(Book b1, Book b2) 
		    {
			int diff = b1.getIsbn().compareTo(b2.getIsbn());
			return diff;
			}
		}
		
		Compareisbn compare = new Compareisbn();
		
		Set<Book> set = new TreeSet<>(compare); 
		
		set.add(new Book("B45","yash",455.54,25));
		set.add(new Book("B18","ashish",250.5,20));
		set.add(new Book("B7","Harshal",452.45,25));
		set.add(new Book("B99","Shubham",200.23,85));
		set.add(new Book("B25","Ajay",23.12,25));
		set.add(new Book("B7","Harshal",452.45,25));
		
		
		Iterator<Book> iterator = set.iterator();
        while (iterator.hasNext()) {
            Book b1 = iterator.next();
            System.out.println(b1);

	}

}

}
