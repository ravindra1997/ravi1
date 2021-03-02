package com.techouts.day7;

public enum Demo 
{
	RAJA(80),ramu(90),rakesh(100);
	private int marks;
	
	Demo(int marks)
	{
		this.marks=marks;
	}
	public static void main(String[] args) {
		Demo demo=Demo.RAJA;
		System.out.println(demo.marks);
	}
	

}
