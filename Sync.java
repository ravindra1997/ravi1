package com.techouts.day8;

public class Sync {
	// synchronized public void print(int n)//if we keep this thread as synchronized
	// we can get output once the thread release the lock of object and completion
	// of its task
	public void print(int n) {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

	}
}
