package com.techouts.day7;

public class Strings {
	
	public static String concat()
	{
		String s="ravindra";
		for(int i=0;i<=1000;i++)
		{
			s=s+"ram";
		}
		return s;
	}
	public static StringBuffer concat2()
	{
	 StringBuffer  buffer=new StringBuffer("ravindra");
	 for(int i=0;i<=1000;i++)
	 {
		 buffer.append("ram");
	 }
	 return buffer;
	}
	
	
	
	}
