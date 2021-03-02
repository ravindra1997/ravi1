package com.techouts.day3;

public class DemoMain
{
	static final int j;
	public DemoMain()
	{
		//j=100;
	}
	static
	{
		j=100;
	}
	public static void main(String... arg)
	{
		System.out.println("hello");
		Demo demo1=new Demo();
		System.out.println(demo1.i);
		
	}

}
