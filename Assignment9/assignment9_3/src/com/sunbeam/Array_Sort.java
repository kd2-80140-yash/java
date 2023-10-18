package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";

	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}
	 public class Array_Sort 
   {
	public static void main(String[] args) 
	{
	Student[] arr = new Student[5];
	arr[0] = new Student(1,"Ram","Pune",95.0);
	arr[1] = new Student(2,"Shyam","Mumbai",96.0);
    arr[2] = new Student(3, "Tarun","Banglore",98.0);
	arr[3] = new Student(4,"Karan","Hyderabad",90.0);
	arr[4] = new Student(5,"Raj","Chennai",78.5);
	
	// local class
			class StudentCityDescMarksDescNameComparator implements Comparator<Student> {
				@Override
				public int compare(Student s1, Student s2) {
					int diff = -s1.getCity().compareTo(s2.getCity());
					if(diff == 0)
						diff = -Double.compare(s1.getMarks(), s2.getMarks());
					if(diff==0)
					{
						diff = s1.getName().compareTo(s2.getName());
					}
					return diff;
				}
			}
			StudentCityDescMarksDescNameComparator comparator = new StudentCityDescMarksDescNameComparator();
			Arrays.sort(arr, comparator);
			System.out.println("After Sort by City,Marks,Name: ");
			for (Student s : arr)		
				System.out.println(s);
		}
   }
	