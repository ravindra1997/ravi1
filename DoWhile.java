package day1;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		System.out.println("hello world");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int temp = i;
		int temp2 = 0;
		int n;

		/*
		 * while(i>0); { n=i%10; n=i/10; temp2=temp2+(n*n*n);
		 * 
		 * 
		 * }
		 * 
		 * if(temp==temp2) { System.out.println("armstrong it is"); } else {
		 * System.out.println("no armstrong found"); }
		 */
		do {
			System.out.println("value of num:" + i);
			i++;

		} while (i<10);
	}
}
