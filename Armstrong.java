package com.general;

public class Armstrong
{
			public static void main(String[] args)
		{
			int i=100;
			int n;
			int k=1;
			int temp=i;
			while(i>0)
			{
				n=i%10;
				k=k*n*n*n;
				i=i/10;
				
			}
			if (temp==k)
			{
			System.out.println("Given Number is ArmstrongNumber");	
			}
			else
			{
				System.out.println("not an armStrong Number");
			}
			
		}

	}



