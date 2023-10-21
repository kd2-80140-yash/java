package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriter
{
   public static void main(String[] args) 
   {
	 Scanner sc = new Scanner(System.in);
	 
	 try
	 {
		 FileWriter fw = new FileWriter("file.txt");
		 BufferedWriter bwr = new BufferedWriter(fw);
		 
		 for (int i = 1; i <= 4; i++) 
		 {
            System.out.print("Enter line " + i + ": ");
             String line = sc.nextLine();
             bwr.write(line);
             bwr.newLine();
		 }
		 bwr.close();
        // FileWriter.close();
         
         System.out.println("Lines have been written to  'file.txt'");
	 }
	 catch(IOException e) {
         System.err.println("An error  is : " + e.getMessage());
     }
	 
   }
}
