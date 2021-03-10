package String_Programs;

import java.util.ArrayList;

public class Demo4 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		numbers.forEach((n) -> {
			System.out.println(n);
		});
		ArrayList<String> s=new ArrayList<String>();
		s.add("hi");
		s.add("hello");
		s.add("namaste");
		s.forEach((h)->{
			System.out.println(h);
		});
	}

}
