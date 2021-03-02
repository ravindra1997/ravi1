package day1;

public class Operators
{
	public static void main(String[] args) {
		System.out.println("hello");
		int i=10;
		System.out.println(i++);
		System.out.println(i--);
		System.out.println(i+=2);
		System.out.println(++i);
		int i1=99;
		int i2=10;
		System.out.println(~i2);
		System.out.println(~i1);
		//ShiftOperator
		System.out.println(10<<2);
		System.out.println(-10>>>2);
		System.out.println((i1<i2)?i1:i2);
		short s=15;
		short s1=12;
		s= (short) (s+s1);
		System.out.println(s);
	}

}
