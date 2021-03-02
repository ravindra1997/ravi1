package Day2;

public class Inheritance2 extends Inheritance
{
	static int j=12;
	int k=10;
	public int add()
	{
		return 12;
	}
	public static void run()
	{
		System.out.println("hell oraja");
	}
	public static void main (String []arg)
	{
		Inheritance inheritance=new Inheritance2();
		System.out.println(inheritance.i);
		//System.out.println(inheritance.add());
		Inheritance.run();
		Inheritance2 inheritance2=new Inheritance2();
		System.out.println(inheritance2.j);
		System.out.println(inheritance2.i);
		//inheritance2.run();
	}

}
