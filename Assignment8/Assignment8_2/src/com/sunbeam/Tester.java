package com.sunbeam;

public class Tester {
	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.get().show();
		}
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.get().toString());
		}
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.accept();
		Box<Person> b1 = new Box<>();
		b1.set(p1);
		printDisplayableBox(b1);
		
		Date d1 = new Date();
		d1.accept();
		Box<Date> b2 = new Box<>();
		b2.set(d1);
		printDisplayableBox(b2);
		
		Box<String> b3 = new Box<>();
		b3.set("Shikhar");
		
		printAnyBox(b1);
		printAnyBox(b2);
		printAnyBox(b3);

	}

}

