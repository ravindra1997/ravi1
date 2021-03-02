package com.techouts.day8;

public class Sync_Main
{
	public static void main(String[] args) {
		
		
		System.out.println("hello world");
		
		Sync sync=new Sync();
		Sync1 sync1=new Sync1(sync);
		Sync2 sync2=new Sync2(sync);
		sync1.start();
		sync2.start();
	}

}
