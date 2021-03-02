package com.techouts.day7;

import java.util.Scanner;

public class String_programme
{
	public static void sample()
	{
		System.out.println("enter the string value");
		
		Scanner scanner=new Scanner(System.in);
		
		String s=scanner.nextLine();
		
		String s1[]=s.split(" ");
		
		int size=s1.length;
		
		for(int i=0;i<=size-1;i++)
		{/*
			 * if(s1[i].length()>4) { s1[i].replace('j', 'k'); } else { s1[i].replace('r',
			 * 'j'); }
			 */
			System.out.println(s1[i]);
			System.out.println(s1[i].replace("is", "was"));
		
		
		
		}
		}

}
