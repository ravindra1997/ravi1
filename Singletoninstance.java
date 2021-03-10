package String_Programs;

public class Singletoninstance 
{
	public static void main(String[] arg)
	{
		singleton s=singleton.run(null);
		singleton s1=singleton.run(s);
		System.out.println(s.run(null));
	}

}
