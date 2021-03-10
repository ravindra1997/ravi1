package com.general;

import java.util.Scanner;

public class MaxElement 
{
	
	public static void main(String[] args) {
		System.out.println("enter the size of an array");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		System.out.println("enter the elements of size"+size);
		int arr[]=new int[size];
		for (int i = 0; i < size; i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0; i<size; i++) {
			int max=0;
			for (int j = i; j < arr.length; j++)
			{
				if (arr[i]>arr[j])
				{
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
					
					
				}
				
			}
			
			
		}
		System.out.println(arr[0]);
		
	
		
		}


}
