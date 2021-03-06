package String_Programs;

public class Demo6
{
	public void saying()
	{
		System.out.println("hello master");
	}
	public static void main(String[] args) {
		
		Demo6 i=new Demo6();
		
		Interface interface1=i::saying;
		
		interface1.say();
		
		Interface interface2=new Demo6()::saying;
		
		interface2.say();
		
		
	}

}
