package com.techouts.day3;

public class Encapsulation {
	private String name;
	private String id;
	private long phonenumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isDigit(ch)) {

				System.out.println("enter alphabets only");
				System.out.println("retry");
				//setName(name);
			} else {
				this.name = name;
			}
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		//System.out.println("enter proper id");
		if (id.length() == 3) {
			this.id = id;
		} else {

			System.out.println("length of id must be 3");
			System.out.println("re-enter the id");
			//setId(id);
		}
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		//System.out.println("enter the phonenumber");
		int length = 0;
	long temp=	phonenumber;
		//int temp;
		while (phonenumber > 0) {
			phonenumber = phonenumber / 10;
			++length;
		}
		if (length==10) {
			this.phonenumber = temp;
		}

		else {
			System.out.println("phonenumber should be 10 numbers");
			System.out.println("re-enter numbers");
			//setPhonenumber(phonenumber);
		}
	}

}
