package String_Programs;

public class Method 
{
	public Method(String name)
	{
		System.out.println(name);
	}
	public static  void main(String...arg)
	{
		Interface3 interface1=Method::new;
		interface1.say("say your name");
	}

}
