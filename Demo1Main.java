package String_Programs;

public class Demo1Main 
{
	public static void main(String[] arg)
	{
		System.out.println("welcome");
	
		
		/*
		 * Demo1 d=new Demo1(); d.start();
		 */
		Runnable r=new Demo1("ramu","8985");
		Thread t=new Thread(r);
		t.start();
		r.notify();
		/*
		 * System.out.println(); System.out.println(Thread.currentThread());
		 * System.out.println(Thread.currentThread().getName());
		 * System.out.println(Thread.currentThread().isAlive());
		 */	}

}
