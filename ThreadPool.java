package com.techouts.day8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadPool implements Runnable
{
	private String name;
	public ThreadPool(String name)
	{
		this.name=name;
	}
	
	
	public void run()
	{
		try
		{
		Date date=new Date();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat();
		
		System.out.println("the time to complete the task :"+name+" "+dateFormat.format(date));
		
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
