package com.general;

import java.util.Scanner;


public class CountDigits 
{
	public static void main(String[] args) {
		/*
		 * int n=34256; int count=0; while(n!=0) { n=n/10; count++; }
		 * System.out.println(count);
		 */
	 Scanner sc=new Scanner(System.in);
     System.out.println("================================");
     for(int i=0;i<3;i++)
     {
         java.lang.String s1=sc.next();
         int x=sc.nextInt();
         //Complete this line
          System.out.printf("%-14s %03d\n", s1, x);
     }
     System.out.println("================================");
}}