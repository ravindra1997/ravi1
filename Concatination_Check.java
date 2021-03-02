package com.techouts.day7;

public class Concatination_Check
{
	
public static void main(String[] arg)
{
	System.out.println("hello world");
	
	long time=System.currentTimeMillis();
	
	Strings.concat();
	System.out.println(System.currentTimeMillis()-time);
	time=System.currentTimeMillis();
	
	System.out.println(System.currentTimeMillis()-time);
}
}
