package String_Programs;

import java.util.Arrays;

public class ArrayParallelShort {
	public static void main(String[] arg) {
		int i[] = { 1, 5, 8, 9, 10, -3 };
		for (int a : i) {
			System.out.print(a+" ");
		}
		Arrays.parallelSort(i);
		System.out.println("\nAfter Shorting");
		for (int a : i) {
			System.out.print(a+" ");
		}
	}

}
