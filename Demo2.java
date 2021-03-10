package String_Programs;

public class Demo2 extends Thread
{
	

	      public void run()
	      {
	            System.out.println("run() method");
	            String threadName = Thread.currentThread().getName();
	            Integer threadPrio = Thread.currentThread().getPriority();
	            System.out.println(threadName + " has priority " + threadPrio);
	      }
	      public static void main(String[] args) throws InterruptedException
	      {
	            Demo2 t1 = new Demo2();
	            Demo2 t2 = new Demo2();
	            Demo2 t3 = new Demo2();

	            t1.setPriority(Thread.MAX_PRIORITY);
	            t2.setPriority(Thread.MIN_PRIORITY);
	            t3.setPriority(Thread.NORM_PRIORITY);
	  
	            t1.start();
	            t2.start();
	            t3.start();
	      }
		
		
	}


