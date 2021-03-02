package com.techouts.day3;

public class GarbageCollection 
{
	//when object having no reference variable or existing reference variable assigned to another object automatically previous obj will be deleted. 
	//it is implicitly done by by jvm in java actually 
	//finalize() will be used in this topic 
	//as a reference
	public void finalize()
	{
		System.out.println("seeking");
	}
	
}
