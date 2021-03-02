package com.techouts.day3;

import java.util.Scanner;

public class EncapsulationMain {
	public static void main(String[] arg) {
		System.out.println("enter name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("enter the id");
		String id = scanner.next();
		System.out.println("enter phonenumber");
		long phonenumber = scanner.nextLong();
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setName(name);
		encapsulation.setId(id);
		encapsulation.setPhonenumber(phonenumber);
		System.out.println(encapsulation.getName());
		System.out.println(encapsulation.getId());
		System.out.println(encapsulation.getPhonenumber());
	}

}
