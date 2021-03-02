package com.techouts.day8;

public class threading_main {
	public static void main(String[] args) {

		Runnable runnable = new Threading();
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
