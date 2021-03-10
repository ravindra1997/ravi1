package String_Programs;

import java.lang.reflect.Method;
import java.util.function.BiFunction;

public class Method_Reference_Eample {

	public static void test() {
		System.out.println("hello people");
	}

	public static void main() {
		Method_Reference_Interface interface1 = Method_Reference_Eample::test;

		interface1.say();
	}

	public static void withRunnable() {
		System.out.println("Thread is running");
	}

	public static void main2() {
		Thread thread = new Thread(Method_Reference_Eample::withRunnable);
		thread.start();
	}

	public static int add(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static double multi(double a, int b) { // System.out.println(a*b);
		return a * b;
	}

	public static int div(int a, int b) { // System.out.println(a/b);
		return a / b;
	}

	public static void main3() {
		BiFunction<Integer, Integer, Integer> add = Method_Reference_Eample::add;
		
		BiFunction<Double, Integer, Double> multi = Method_Reference_Eample::multi;
		
		BiFunction<Integer, Integer, Integer> div = Method_Reference_Eample::div;
		
		System.out.println(add.apply(20, 30));
		
		System.out.println(multi(210, 10));
		
		System.out.println(div.apply(50, 10));
	}

	public void run() {
		System.out.println("say something");
	}

	public static void main(String... arg) {
					
		Method_Reference_Eample eample = new Method_Reference_Eample();
		
		Method_Reference_Interface interface1 = eample::run;
		
		interface1.say();
		
		main3();
		
		main2();
		
		main();
	}
	

}
