package String_Programs;

public class Demo9 extends Thread
{
	public void run() 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		show();
		show1();
	}
	public void show1()
	{
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("kingdom");
		//notify();
	}
	public void show()
	{
		System.out.println("hello master");
	    Thread.currentThread().setName("Tech");
	    System.err.println(Thread.currentThread().getName());
	
		for(int i=0;i<=5;i++)
		{
			try {
			
				wait();
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
    
	
	
	public static void main(String[] arg)
	{
		Demo9 demo9=new Demo9();
		Demo9 demo=new Demo9();
		Demo9 demo1=new Demo9();
		demo9.start();
		try {
		demo9.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("exception occurs");
		}
		demo.start();
		demo1.start();
		/*
		 * demo9.show(); demo9.show();
		 */
		
	}
}
