package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class Solution4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four strings");
		try(FileWriter fr = new FileWriter("file.txt"))
		{
			try(BufferedWriter bout = new BufferedWriter(fr))
			{
				for(int j=0;j<4;j++)
				{
					String line = sc.nextLine();
					bout.write(line+ "\n");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String str = " ";
		try(FileReader frr = new FileReader("file.txt"))
		{
			try(BufferedReader br = new BufferedReader(frr))
			{
				while((str = br.readLine())!=null)
				{
					System.out.println(str);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
