package com.techouts.day8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain 
{
	static int max=2;
	public static void main(String...arg)
	{
		
		Runnable runnable =new ThreadPool("start the game");
		Runnable  runnable2=new ThreadPool("conitnue the game");
		Runnable runnable3=new ThreadPool("end the game");
		Runnable  runnable4=new ThreadPool("new game to start");
		
		ExecutorService executorService=Executors.newFixedThreadPool(max);
		
		executorService.execute(runnable);
		executorService.execute(runnable2);
		executorService.execute(runnable3);
		executorService.execute(runnable4);
		
		executorService.shutdown();
		
		
		
		
		
		
	}

}
