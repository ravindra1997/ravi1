package day1;

import java.util.Scanner;

public class Swith {
	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		/*
		 * switch (n) { case 1: System.out.println("first case");
		 * 
		 * break; case 2: System.out.println("second case");
		 * 
		 * default: System.out.println("wrong entry"); break; }
		 */
		int b = scanner.nextInt();
		switch (n) {
		case 1:
			switch (b) {
			case 10:
				System.out.println("nested switch");

				break;
			case 11:
				System.out.println("nested switch 2");

			default:
				System.out.println("come out now");
				break;
			}

			break;
		case 2:
			switch (b) {
			case 2:
				System.out.println("2nd nested");
			case 3:
				System.out.println("wooohhhhoo");
			default:
                System.out.println("go away");
			}

		default:
			System.out.println("rejected");
			break;
		}
	}
}
