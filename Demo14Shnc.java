package String_Programs;

public class Demo14Shnc
{
	synchronized void print(int n)
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	

}
