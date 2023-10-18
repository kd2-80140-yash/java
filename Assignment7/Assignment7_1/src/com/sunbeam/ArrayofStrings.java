package com.sunbeam;
import java.util.Scanner;

public class ArrayofStrings 
{




	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s1[] = {"Ashish", "Girish", "Abhey", "Sameer", "Shikhar"};
		String s2[] = {"Yash", "Abhey", "Bhanu", "Utkarsh", "Shashank"};
		
		for(String ele : s1) {
			for(String ele1 : s2) {
				if(ele.equals(ele1)) {
					System.out.println("The Duplicate String is : " + ele1);
				}
			}
		}
		
		scan.close();
	}
}
	
	
