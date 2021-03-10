package com.general;

public class MultiThreading implements Runnable
{
	public void walk()
	{
		
		System.out.println("walkable it is");
	}
	public void runing()
	{
		for(int i=1;i<=5;i++)
		try {
			Thread.sleep(500);
			System.out.println(i);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("runnable");
	}
	public void run()
	
	{
		System.out.println("hello");
		runing();
		walk();
	}


}
