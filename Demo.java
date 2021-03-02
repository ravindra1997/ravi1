package com.techouts.day8;

import java.util.Scanner;

public class Demo
{
	public static void main(String...arg) {
		Scanner scanner=new Scanner(System.in);
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


}
