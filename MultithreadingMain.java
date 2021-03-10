package com.general;



public class MultithreadingMain 
{
	public static void main(String...arg) {
	MultiThreading multiThreading=new MultiThreading();
	Thread thread=new Thread(multiThreading);
	thread.start();
	//multiThreading.start();
     
	//thread.start();//exception occures we can not use start method twice
	/*
	 * Thread thread2=new Thread(multiThreading); thread.start();
	 */
	//thread.run();
	//thread.run();
	//you can not call thread directly so that it will act like a normal object no use of threading

}}
