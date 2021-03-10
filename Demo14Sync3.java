package String_Programs;

public class Demo14Sync3 extends Thread
{
	Demo14Shnc c;
	public Demo14Sync3(Demo14Shnc c)
	{
		System.out.println("hello");
	    this.c=c;
	}
	public void run()
	{
		c.print(50);
	}

}
