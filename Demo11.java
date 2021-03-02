package Training;

import java.util.Iterator;
import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {

		System.out.println("ente rsentence");
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		String str = "";
		for (int i = 0; i < s.length(); i++)

		{
			// char ch=s.charAt(i);
			if (s.charAt(i) == '_') {
				str = str + " ";
			} else {
				str = str + Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(str);

	}

}
