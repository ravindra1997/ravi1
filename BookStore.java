package com.techouts.firsttask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class BookStore {
	Map<Integer, String> horror = new HashMap<Integer, String>();
	Map<Integer, String> sup = new HashMap<Integer, String>();
	Map<Integer, String> thr = new HashMap<Integer, String>();

	public void genre() {
		System.out.println("Welcome to My BookStore");

		System.out.println("enter the number as of your choice");

		System.out.println("1.Horror");
		System.out.println("2.SuperHero");
		System.out.println("3.Thriller");
		Scanner scanner = new Scanner(System.in);
	
		
		try {
			int option = scanner.nextInt();
			if (option > 0 && option <=3) {
				switch (option) {
				case 1:
					horror();

					break;
				case 2:
					superHero();
					break;
				case 3:
					thriller();
					break;
				default:
					System.out.println("error");
				}
			} else {
				System.out.println("enter appropriate number only");
				genre();
			}
		} catch (Exception e) {

			System.out.println("please enter appropriate number");
			genre();

		}
	}

	public void thriller() {
		System.out.println("Available in this zoner");

		for (Map.Entry e : thr.entrySet()) {

			System.out.println(e.getKey() + " " + e.getValue());

		}
		System.out.println("enter the appropriate key");

		try {
			Scanner scanner = new Scanner(System.in);
			int sel = scanner.nextInt();

			if (sel < 4&&sel>0) {
				System.out.println("thanks for booking");
				System.out.println("your booking book details :" + thr.get(sel));
				thr.remove(sel);
			}
		} catch (Exception e) {
			System.out.println("please enter the existing number in the list");
			thriller();
		}
		System.out.println("if you want to continue press 1 or enter 2 to go back to main page enter any key to exit ");
		Scanner scanner = new Scanner(System.in);
		
		try {
			int i = scanner.nextInt();
			if (i == 1) {
				thriller();
			}
			if (i == 2) {
				genre();
			}
			else
			{
				System.out.println("thank you");
			}
		} catch (Exception e) {
			System.out.println("thanks for the visiting have a nice day");
		}

	}

	public void superHero() {
		System.out.println("Available in this zoner");

		for (Map.Entry e : sup.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println("enter the appropriate key to book");
		Scanner scanner = new Scanner(System.in);
		
		try {
			int sel2 = scanner.nextInt();
			if (sel2 > 0&& sel2<6) {
				System.out.println("thanks for booking");
				System.out.println("your booking details are: " + sup.get(sel2));
				thr.remove(sel2);
			}
		} catch (Exception e) {
			System.out.println("please enter the existing number in the list");
			superHero();
		}
		System.out.println(
				"if you want to continue press 1 or enter 2 to go back to main page or press any key to exit ");
		
		try {
			int i = scanner.nextInt();
			if (i == 1) {
				superHero();
			}
			if (i == 2) {
				genre();
			}
			else
			{
				System.out.println("thankyou");
			}
		} catch (Exception e) {
			System.out.println("thanks for the visiting");
		}

	}

	public void horror() {
		System.out.println("Available in this zoner");
		for (Map.Entry e : horror.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println("enter the appropriate key to book");
		Scanner scanner = new Scanner(System.in);
		
		try {
			int sel3 = scanner.nextInt();
			if (sel3 < 5 && sel3>0) {
				System.out.println("thanks for booking");
				System.out.println("your booking details are :" + horror.get(sel3));
				horror.remove(sel3);
			}
		} catch (Exception e) {
			System.out.println("please enter the existing number in list");
			horror();
		}
		System.out.println(
				"if you want to continue with same genre press 1 or enter 2 to main page or enter any key to exit ");
		
		try {
			int i = scanner.nextInt();
			if (i == 1) {
				horror();
			}
			if (i == 2) {
				genre();
			}
			else
			{
				System.out.println("thank you");
			}
		} catch (Exception e) {
			System.out.println("thanks for the visiting have a nice day");
		}

	}

}