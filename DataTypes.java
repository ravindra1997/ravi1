package com.general;

import java.util.Scanner;

public class DataTypes 
{

	public static void main(String[] args) {
		System.out.println("enter the size of the numbers");
		Scanner scanner = new Scanner(System.in);
		/*
		 * int n = scanner.nextInt(); System.out.println("enter the numbers"); for (int
		 * i = 0; i <= n; i++) { try { long x = scanner.nextLong(); System.out.println(x
		 * + " can be fitted in:"); //if (x >= -128 && x <= 127) if (x >= Byte.MIN_VALUE
		 * && x <= Byte.MAX_VALUE) { System.out.println("* byte"); } //if (x >= -32768
		 * && x <= 32767) if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
		 * 
		 * System.out.println("* Short");
		 * 
		 * } if (x >= Integer.MIN_VALUE && x <= Integer.MIN_VALUE) // if (x >=
		 * -2147483648 && x <= 2147483647) {
		 * 
		 * System.out.println("* int");
		 * 
		 * if (x >= Long.MIN_VALUE && x <= Long.MIN_VALUE) //if (x >= -2147483648 && x
		 * <= 2147483647) {
		 * 
		 * System.out.println("* long"); } catch (Exception e) {
		 * System.out.println(scanner.nextInt() + " can't be fitted in any where"); }
		 */

		//Scanner sc = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long x = scanner.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127) {
					System.out.println("* byte");
				}
				if (x >= -32768 && x <= 32767) {
					System.out.println("* short");
				}
				if (x >= -2147483648 && x <= 2147483647) {
					System.out.println("* int");
				}
				if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(scanner.next() + " can’t be fitted anywhere.");
			}

			{

			}

		}

	}
}
