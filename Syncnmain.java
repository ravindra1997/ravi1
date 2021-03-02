package com.techouts.day8;

public class Syncnmain {

public static void main(String...arg)
{
	System.out.println("hello there");
	
	Syncn  syncn=new Syncn();
	
	Thread thread=new Thread() {
	public void run()
	{
		syncn.print(5);
	};
	Thread  thread1=new Thread() {
	public void run()
	{
		syncn.print(20);
	}
	};

	}
	
	
	}
//AXWPY4418R