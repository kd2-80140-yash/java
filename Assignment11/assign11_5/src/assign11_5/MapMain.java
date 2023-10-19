package assign11_5;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Map<String,Book>map = new HashMap<>();
		
		Book b = new Book("b1","Yash",500.0,25);
		map.put(b.getIsbn(), b);
		
		 b = new Book("b2","Ashish",200.0,10);
		 map.put(b.getIsbn(), b);
		 
		 b = new Book("b3","Girish",150.00,15);
		 map.put(b.getIsbn(), b);
		 
		 b = new Book("b4","Hrishikesh",130.0,25);
		 map.put(b.getIsbn(), b);
		 
		 b = new Book("b5","Shrilekh",300.0,20);
		 map.put(b.getIsbn(), b);
		 
		 System.out.println("Enter the isbn of the book you want to search");
		 String str = sc.next();
		 Book b2 = map.get(str);
		 System.out.println("The Book with Isbn " + str + " is " + b2);
			
		
		
	}
}
