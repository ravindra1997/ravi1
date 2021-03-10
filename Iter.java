package String_Programs;

public class Iter extends Thread
{
	public void set()
	{
		try {
		for(int i=0;i<=10;i++) {
		System.out.println("set the thread ");
		//wait();
		Thread.sleep(500);
		System.out.println(i);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void get()
	{
		for(int i=0;i<=5;i++) {
			System.out.println("get priority");
			System.out.println(i);
			//notifyAll();
			
		}
	}
	public void run()
	{
		set();
		get();
	}
	public static void main(String[] arg)
	{
		System.out.println("hello world");
		Iter iter=new Iter();
		iter.start();
	}

}
