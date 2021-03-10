package com.general;



public class Pattern5 
{
	public static void main(String[] args) 
	{
		int star=-1;
		int space=3;
		for (int i = 0; i <=3; i++) 
		{
			star++;
			space--;
			for (int j = 0; j <=space; j++) 
			{
				System.out.print(" ");
				
			}
			for (int j = 0; j <star; j++)
			{
				System.out.print("*  ");
				
			}
			System.out.println();
		}
		
		
	}

}
