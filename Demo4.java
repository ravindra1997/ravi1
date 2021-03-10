package com.general;

import java.util.Scanner;

public class Demo4
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// While.count(1);
		int count = 1;
		while (scanner.hasNext())
		{
			String s1 = scanner.nextLine();
			System.out.println(count + " " + s1);
			count++;
		}

	}
	/*
	 * public static void count(int i) { Scanner scanner=new Scanner(System.in);
	 * 
	 * if (i>0) { String s=scanner.nextLine(); System.out.println(i+" "+s); i++;
	 * count(i);
	 * 
	 * } }
	 */


}
