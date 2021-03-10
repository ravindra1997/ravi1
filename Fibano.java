package com.general;

public class Fibano 
{
	public static void main(String[] args) 
	{
		int n=0;
		int m=1;
		int temp;
		System.out.print(n+" "+m);
		for (int i = 2; i < 10; i++)
		{
			temp=m+n;
			System.out.println(" "+temp);
			m=n;
			n=temp;
			
			
		}
		
		
	}


}
