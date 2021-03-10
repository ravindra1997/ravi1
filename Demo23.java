package String_Programs;

import FileIO.Demo3;

public class Demo23 
{
	String name="srikanth";
	int i=10;
	double d=20.20;
	
	public Demo23(String name,int i,double d)
	{
		this.name=name;
		
		System.out.println(name);
		System.out.println(i);
		System.err.println(d);
	}
	public static void main(String[] args) {
		Demo23 demo23=new Demo23("ravindra", 20, 33.3);
		//.out.println(demo23);
		
	}

}
