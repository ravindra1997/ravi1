package com.general;



public class StringProgram
{
	public static void main(String[] arg)
	{
		StringProgram.fizzbuzz(15);
		
	}
	public static void fizzbuzz(int n)
	{
		for (int i = 1; i <=15; i++)
		{
			
			if ((i%3==0)&&(i%5==0))
			{
				System.out.println("FizzBuzz");
				
			}
			else if (i%3==0)
			{
				System.out.println("Fizz");
			}
			else if (i%5==0)
			{
				System.out.println("Buzz");
				
			}
			else
			{
				System.out.println(i);
			}
			
		}
	}

}
