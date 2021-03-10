package String_Programs;

public class Demo14Sync2 extends Thread
{
  Demo14Shnc s;
  public Demo14Sync2(Demo14Shnc s)
  {
	  this.s=s;
  }
  public void run()
  {
	  s.print(5);
  }
}
