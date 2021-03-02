package com.techouts.day8;

import java.util.Scanner;

public class Threading implements Runnable {

	public void test() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("enter name");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		System.out.println("welcome " + name);
		System.out.println("enter array size");
		int arr = scanner.nextInt();

		System.out.println("enter the elememnts of a size " + arr);

		String str[] = new String[arr];
		String s = "";

		for (int i = 0; i <= arr - 1; i++) {
			str[i] = scanner.next();
		}
		System.out.println("enter the movie name");
		// String te=scanner.next();
		String te = "yoyo";
		for (int i = 0; i <= arr - 1; i++) {
			if (str[i].equals(te)) {
				System.out.println(str[i]);
			} else {
				System.out.println("wrong selection");
			}
		}

	}

	public void test1() {
		// notify();
		System.out.println("thank you for visiting");
	}

	public void run() {
		test();
		test1();
	}

}
