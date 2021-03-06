package String_Programs;

public class Demo13 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("nothing found here");
		}

	}
	public static void main(String...arg)
	{
		System.out.println("Daemon");
		Demo13 demo13=new Demo13();
		
		demo13.setDaemon(true);

		Demo13 demo132=new Demo13();
		demo132.start();
		demo13.start();

			}

}
