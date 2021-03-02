package com.techouts.day8;

public class Sync2 extends Thread 
{
  Sync s;
  Sync2(Sync s)
  {
	  this.s=s;
  }
  public void run()
  {
	  s.print(5);
  }
}
