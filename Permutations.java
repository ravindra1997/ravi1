package com.general;

import java.util.Scanner;


public class Permutations 
{
	public static String swap(String a, int i, int j)
	{
		char temp;
		char ch[] = a.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	public static void permutation(String string, int f,int l)
	{
		if (f==l)
		{
			System.out.println(string);
		}
		else
		{
			for (int i = f; i <=l; i++)
			{
				string=swap(string,f,i);
				permutation(string, f+1, l);
				//swap(str,f,i);
			}
			
		}
	}
	public static void main(String arg[])
	{
		Scanner  scan=new Scanner(System.in);
		System.out.println("enter the String");
		String string=scan.next();
		int n=string.length()-1;
		Permutations.permutation(string, 0, n);
	}


}
