package com.sunbeam;

public class StringWordCount 
{
	public static void main(String[] args) {
		String s1 = new String("yash is a student of sunbeam");
		
		String[] s2 = s1.split(" ");
		int count = 0;
		
		for(String str : s2) {
			count++;
		}
		System.out.println(count);
	}

}
