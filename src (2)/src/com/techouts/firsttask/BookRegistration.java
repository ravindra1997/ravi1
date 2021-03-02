package com.techouts.firsttask;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BookRegistration {

	static String phonenumber;
	static String pass;
	static String name;

	public void name() {
		try {
			BookRegisterFirst first = new BookRegisterFirst();
			System.out.println("enter your name");
			Scanner scanner = new Scanner(System.in);
			name = scanner.nextLine();
			if ((Pattern.matches("[a-zA-Z]{6,}", name))) {
				first.setName(name);
				System.out.println("your name " + name);
			}

			else {
				throw new BookRulesShouldFollow();
			}
		} catch (BookRulesShouldFollow e) {
			System.out.println("re-enter please");
			name();
		}
	}

	public void phonenumber() {
		BookRegisterFirst first = new BookRegisterFirst();
		System.out.println("enter phonenumber");
		Scanner scanner = new Scanner(System.in);
		try {
			phonenumber = scanner.next();
			if (Pattern.matches("\\d{10}", phonenumber)) {
				first.setPhonenumber(phonenumber);
				System.out.println("your phone number: " + first.getPhonenumber());

			} else {
				throw new BookRulesShouldFollow();
			}
		} catch (BookRulesShouldFollow e) {

			System.out.println("re-enter please");
			phonenumber();
		}
	}

	public void mail() {
		BookRegisterFirst first = new BookRegisterFirst();
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your mail id");

		try {
			String mail = scanner.nextLine();
			if ((Pattern.matches("[a-zA-Z0-9]*@.+.com", mail))) {
				first.setMailid(mail);
				System.out.println("your mail id is: " + first.getMailid());
			} else {
				throw new BookRulesShouldFollow();
			}
		} catch (BookRulesShouldFollow e) {
			System.out.println("mail id should be end with @");
			System.out.println("re-enter please");
			mail();
		}
	}

	public void pass() {
		BookRegisterFirst first = new BookRegisterFirst();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter password");
		try {
			pass = scanner.next();
			if (Pattern.matches("[a-zA-Z0-9]*", pass)) {
				first.setPassword(pass);
				System.out.println("your password is: " + first.getPassword());
			} else {
				throw new BookRulesShouldFollow();
			}

		} catch (BookRulesShouldFollow e) {
			System.out.println("re-enter please");
			pass();

		}
	}

	public void login() {
		System.out.println("please login");

		System.out.println("enter your registered mobile number and password");

	
		Scanner scanner = new Scanner(System.in);
		try {
			String phone = scanner.nextLine();
			System.out.println("password please");
			String passw = scanner.next();

			if (phone.equals(phonenumber) && passw.equals(pass)) {
				System.out.println("welcome : " + name);
				new BookDisplay().displayBook();
			} else {
				throw new BookRulesShouldFollow();
			}
		} catch (BookRulesShouldFollow e) {

			login();
		}
	}

	public void registration() {
		name();
		mail();
		phonenumber();
		pass();
		BookRegisterFirst first = new BookRegisterFirst();
		login();
		BookDisplay bookDisplay=new BookDisplay();
		
		bookDisplay.displayBook();	
		//first.sell();

	}

}
