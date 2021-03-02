package day1;

public class InterMain implements Inter
{
	public void walk()
	{
		System.out.println("walking");
	}
	public static void main(String arg[])
	{
		InterMain in=new InterMain();
		in.run();
		in.walk();
	}

}
