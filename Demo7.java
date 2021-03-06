package String_Programs;

public class Demo7 {

	public void run()
	{
		System.err.println("hell ravindra");
	}
	
	
	public static void main(String[] arg)
	{
		
		Thread thread =new Thread(new Demo7()::run);
		thread.start();
		
		
		
	}
	
}
