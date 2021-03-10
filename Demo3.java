package com.general;

import java.util.Scanner;


public class Demo3 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		if(n/2==0)
		{
			System.out.println("weird");
		}
		if((n/2==0)&&(n>2&&n<5))
		{
			System.out.println("not weird");
		}
		if((n/2==0)&&(n>=6&&n<=20))
		{
			System.out.println("weird");
		}
		if(n/2==0 && n>=20)
		{
			System.out.println("not weird");
		}
		System.out.println();
	}
	

}
