package com.general;

public class Thread1Main {
	public static void main(String[] arg) {
		System.out.println("Hello World");
		Thread1 main = new Thread1();
		main.start();
		System.out.println("name" + main.currentThread().getName());
		System.out.println("name2 " + Thread.currentThread().getName());
		System.out.println("id" + main.currentThread().getId());
		System.out.println("priority" + main.currentThread().getPriority());
		System.out.println("isAlive" + main.currentThread().isAlive());
		System.out.println("isDaemon" + main.currentThread().isDaemon());
		System.out.println("isInterepted" + main.currentThread().isInterrupted());
		main.run();
		main.walk();

	}
}
