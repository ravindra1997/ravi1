package com.general;

import java.util.Scanner;


public class Split 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		java.lang.String s1="welcome to the world";
		java.lang.String[] s2=s1.split(" ");
		for (int i = 0; i < s2.length; i++)
		{
			System.out.println(s2[i]);
			
		}
	}

}
