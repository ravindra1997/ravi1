package Day2;

public class Constructor_Programs {
	 int i = 10;

	public static void main(String... arg)
	{
		System.out.println("hi");
		System.out.println();
		
	}

	static {
		System.out.println("hello world");
		Constructor_Programs c=new Constructor_Programs();
		c.math();

	}
	public void math()
	{
		System.out.println(i);
	}
}