package String_Programs;

public class Demo16 
{
	public void diplay()
	{
		System.out.println("hello");
		show();
	}
	public void show()
	{
		System.out.println("showoing");
		//diplay();
	}

	
	public static void main(String...arg)
	{
		Demo16 demo16=new Demo16();
		demo16.diplay();
		demo16.show();
	}
}
