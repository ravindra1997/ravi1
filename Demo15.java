package String_Programs;

public class Demo15 
{
	int n;
	synchronized static void greet(int n)
	{
		for(int i=1;i<6;i++)
		{
			System.out.println("grattitude"+i*n);
		}
	}

}
