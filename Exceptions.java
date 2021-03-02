package Training;

public class Exceptions {
	public static void age(int i) throws Ex {
		System.out.println("Age");
		if (i < 18) {
			throw new Ex("not valid");
		} else {
			System.out.println("eligible for voting");
		}
	}

	public static void main(String[] arg) {
		try {
			//Exceptions ex = new Exceptions();
			age(9);
		} catch (Ex s) {
			System.out.println(s);
		}
		System.out.println("continue");
	}
}