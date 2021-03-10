package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo4 {
	public static void main(String... arg) {
		System.out.println("hello world");
		try {
			FileReader fileReader = new FileReader("ram.txt");
			System.out.println(fileReader.read());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// System.out.println(bufferedReader.nullReader());
			// System.out.println(bufferedReader.read());
			// System.out.println(bufferedReader.r);
			String l;

			while ((l = bufferedReader.readLine()) != null) {
				System.out.println(l);
			}

			System.out.println(fileReader.read());
			bufferedReader.close();
			fileReader.close();
		} catch (Exception e) {

		}
	}

}
