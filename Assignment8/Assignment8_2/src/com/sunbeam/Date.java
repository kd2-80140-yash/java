package com.sunbeam;


	import java.util.Scanner;

	public class Date implements Displayable{
		private int day;
		private int month;
		private int year;
		
		public void accept() {
			System.out.println("Enter the Date: ");
			System.out.print("Day: ");
			this.day = new Scanner(System.in).nextInt();
			System.out.print("Month: ");
			this.month = new Scanner(System.in).nextInt();
			System.out.print("Year: ");
			this.year = new Scanner(System.in).nextInt();
		}
		
		public void show() {
		System.out.println("Date : " + day + "/" + month + "/" + year);
		}
		
		@Override
		public String toString() {
			return "Date : " + day + "/" + month + "/" + year;
		}
	}

