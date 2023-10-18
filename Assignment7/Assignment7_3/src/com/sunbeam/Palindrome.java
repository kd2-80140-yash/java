package com.sunbeam;
import java.util.Scanner;

public class Palindrome 
{




 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = scan.next();
		String str = "";
		
		for(int i = s1.length() - 1 ; i >= 0 ; i--) {
			char ch = s1.charAt(i);
			str = str + ch;
		}
		if(str.equals(s1))
				System.out.println("Yes, String is a Palindrome!!");
		else
				System.out.println("No, String is not a Palindrome!!");
		scan.close();
	}
}


