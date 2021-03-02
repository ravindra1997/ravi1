package com.techouts.day3;

public class Static_Binding 
{
	
	public void arthimatic(int i,int j)
	{
		int a=i+j;
	}
	public void arthimatic(double j,double i)
	{
		double b=j*i;
		System.out.println(b);
	}
	public void arthimatic(int a,long b)
	{
		long c=b/a;
	}
	public void arthimatic(int a,int b,int c)
	{
		int z=a-b-c;
	}
}
