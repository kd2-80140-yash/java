package com.sunbeam;


	import java.util.Scanner;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

	class Book {
		private String isbn;
		private String authorName;
		private double price;
		private int quantity;

		public Book(String isbn, String authorName, double price, int quantity) {

			this.isbn = isbn;
			this.authorName = authorName;
			this.price = price;
			this.quantity = quantity;
		}
		

		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", authorName=" + authorName + ", price=" + price + ", quantity=" + quantity
					+ "]";
		}


		

		@Override
		public int hashCode() {
			
				int hash = Objects.hash(this.isbn);
				return hash;
			}


		@Override
		public boolean equals(Object obj) 
		{
			
			if(obj == null)
				return false;
			if(this == obj)
				return true;
			if(obj instanceof Book) {
				Book other = (Book) obj;
				if(this.isbn == other.isbn)
					return true;
			}
			return false;
		}
		
		
			
			
		}
		



	public class LIbraryLinked {
		public static void main(String[] args) 
		{
			Set<Book> set = new LinkedHashSet<>(); 
			
			set.add(new Book("45","yash",455.54,25));
			set.add(new Book("18","ashish",250.5,20));
			set.add(new Book("7","Harshal",452.45,25));
			set.add(new Book("99","Shubham",200.23,85));
			set.add(new Book("25","Ajay",23.12,25));
			set.add(new Book("7","Harshal",452.45,25));
			
			
			Iterator<Book> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            System.out.println(book);
			
			
		}
	}
	}


