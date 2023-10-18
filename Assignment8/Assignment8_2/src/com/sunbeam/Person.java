package com.sunbeam;


	import java.util.Scanner;

	public class Person implements Displayable{
		private String name;
		private int age;
		
		public void accept() {
			System.out.print("Enter Your Name: ");
			this.name = new Scanner(System.in).next();
			System.out.print("Enter Your age: ");
			this.age = new Scanner(System.in).nextInt();
		}
		
		public void show() {
		System.out.println("Your Name: " + this.name);
		System.out.println("Your Age : " + this.age);
		}
		
		@Override
		public String toString() {
			
			return "Name : " + name + "," + " Age : " + age;
		}
		
		
		
		
	}

