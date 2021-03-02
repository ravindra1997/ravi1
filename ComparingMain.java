package com.techouts.day7;

public class ComparingMain  
{
	
	public static void main(String [] arg)
	{
		System.out.println("Hello");
		Comparing comparing=new Comparing(10, "london", "targarian");
		Comparing comparing2=new Comparing(101,"america","kaleeshi");
		System.out.println(comparing.bname.compareTo(comparing2.bname));
	}

}
