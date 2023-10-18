package com.sunbeam;

public class Reverse_String {



	public static void main(String[] args) {
		String s1 = "Yash";
		
		for(int i = s1.length() - 1 ; i >= 0 ; i--) {
			char ch = s1.charAt(i);
			System.out.print(ch);
		}
	}
}