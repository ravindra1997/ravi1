package String_Programs;

public class Demo14SyncMain 
{
	public static void main(String[] arg)
	{
		Demo14Shnc ob=new Demo14Shnc();
		Demo14Sync2 d1=new Demo14Sync2(ob);
		Demo14Sync3 d=new Demo14Sync3(ob);
		d1.start();
		d.start();

		
	}

}
