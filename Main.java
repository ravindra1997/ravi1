package com.techouts.day3;

public class Main {

	public static void main(String[] args) {
		Polymorphism1 polymorphism1=new Poly1();
		Polymorphism1 polymorphism12=new Poly2();
		InvokePoly invokePoly=new InvokePoly();
		invokePoly.invoke(polymorphism1);
		invokePoly.invoke(polymorphism12);
	}
}
