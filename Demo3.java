package com.techouts.day7;

public class Demo3 {

	static String s = "java is high level programming language in the world";

	public static void main(String[] args) {
		// System.out.println(s);
		/*
		 * System.out.println(EXAMPLE_TEST.matches("\\w.*")); String[] splitString =
		 * (EXAMPLE_TEST.split("\\s+")); System.out.println(splitString.length);//
		 * should be 14 for (String string : splitString) { System.out.println(string);
		 * } // replace all whitespace with tabs
		 * System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
		 */

		System.out.println("hello world");
		System.out.println(s.matches("\\w.*"));
		String split[] = s.split("\\s+");
		int i = split.length;
		System.out.println(i);
		for (String s : split) {
			System.out.println(s);
		}
		s.replaceAll("\\s+", "_");
		System.out.println();
		
		String s="rakesh";
		
		System.out.println(s.concat("hi"));
		String s1=new String("rakesh");
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s);
		StringBuffer s3=new StringBuffer("hello master");
		System.out.println(s3.capacity());
		System.out.println(s3.replace(0, 1, "result"));
		
		
		
		
		System.out.println(s.compareTo(s1));

	}
}
