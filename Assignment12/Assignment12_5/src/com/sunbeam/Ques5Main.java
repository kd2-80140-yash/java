package com.sunbeam;

import java.util.Scanner;

public class Ques5Main
{
	   public static <T> int countIf(T[] arr, T key, Check<T> c) {
	        int count = 0;
	        for (T element : arr) {
	            if (c.compare(element, key)) {
	                count++;
	            }
	        }
	        return count;
	    }


public static void main(String[] args)
{
	Integer[] arr = {44,77,99,22,55,66};
	Integer key = 50;
	
	int cnt = countIf(arr,key,(x,y)-> x>y);
	System.out.println("Count ="+cnt);//(because 4 elements in array are greater than given key i.e. 50)
     
	Double[] arr1 = {1.2,1.5,1.3,1.6,1.2};
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter a key (Double) to count in the array: ");
    Double Key = sc.nextDouble();
    
    int cnt1 = countIf(arr1,Key,(e,k) -> e.equals(Key));
    System.out.println(cnt1);
	
}
}
