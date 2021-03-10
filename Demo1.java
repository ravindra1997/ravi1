package com.general;

import java.util.Iterator;
import java.util.Scanner;

public class Demo1 
{
	public static void main(String...arg)
	{
		System.out.println("enter th esiz eof an array");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		System.out.println("enter the elements off the size "+size);
		String str[]=new String[size];
		for(int i=0;i<size;i++)
		{
		  str[i]=scanner.next();
		 
		}
		for(int i=0;i<size;i++)
		{
		  System.out.println(str[i]);
		 
		}

		//System.out.println(str[]);
		
	}

}
