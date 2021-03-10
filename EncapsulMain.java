package com.general;



public class EncapsulMain 
{
	public static void main(String[] args) {
		
		  Encapsul encapsulation=new Encapsul();
		  encapsulation.setS("techouts"); encapsulation.setW("qwerty");
		  encapsulation.setI(5); int n=encapsulation.getI();
		  System.out.println(encapsulation.getI());
		  System.out.println(encapsulation.getW());
		  System.out.println(encapsulation.getS());
		 
		Byte i= 10;
		byte w=i;
		System.out.println(i);
		
	}

}
