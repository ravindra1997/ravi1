package com.techouts.day3;

public class Garbage_Final
{
	public static void main (String... arg)
	{
		
			GarbageCollection collection=new GarbageCollection();
			GarbageCollection col
			=new GarbageCollection();
			collection=null;
			col=null;
			System.gc();
		}
	}


