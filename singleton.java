package String_Programs;

public class singleton
{
	private static singleton s;
	private singleton()
	{
		//System.out.println("hello");
	}
	public static singleton run(singleton s)
	{
		s=new singleton();
		//singleton s="hello";
		System.out.println("please run");
		return s;

	}
	
}
