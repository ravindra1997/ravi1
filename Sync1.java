package com.techouts.day8;

public class Sync1 extends Thread
{
	Sync s;
  public Sync1(Sync s)
  {
	  this.s=s;
  }
  public void run()
  {
	  s.print(10);
  }
}
