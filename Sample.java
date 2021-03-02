package com.techouts.day3;

import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) {
		/*
		 * String s="8985"; int i=Integer.parseInt(s); System.out.println(i); int temp;
		 */
		int count=0;
		int temp;
		Scanner scanner=new Scanner(System.in);
		Long n=scanner.nextLong();
		while(n>0)
		{
			n=n/10;
			++count;
		}
		System.out.println(count);

	}

}
