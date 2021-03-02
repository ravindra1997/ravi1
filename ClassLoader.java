package day1;

public class ClassLoader {

	// public static void main(String[] args) {
	/*
	 * Class c=ClassLoader.class; System.out.println(c.getClassLoader());
	 * System.out.println(String.class.getClassLoader());
	 */
	byte b = 3;
	static long l;
	byte c = 8;
	float f = 35;
	Integer i = (int) f;
	static char c1;
	static String s;

	public static void run() {
		System.out.println("hello");
		System.out.println(l);
	}

	public static void main(String arg[]) 
	{
		ClassLoader.run();
		System.out.println(ClassLoader.c1);
		System.out.println(ClassLoader.l);
		System.out.println(ClassLoader.s);
	}
}
