package com.general;



public class Pattern2 
{
	public static void main(String[] args) 
	{
		int star=-1;
		int space=5;
		for (int i = 0; i<=5; i++)
		{
			space--;
			star+=2;
			for (int j = 0; j <=space; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <star; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
				
     	}
	}

}
