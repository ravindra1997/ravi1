package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIo5 {
	public static void main(String... arg) throws IOException {
		System.out.println("Hello world");
		Scanner scanner = new Scanner(new File("C:\\Users\\d1\\chmv.txt"));
		// scanner.useDelimiter(",");
		String line = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\d1\\chmvr.txt"));

		while ((line = bufferedReader.readLine()) != null) {
			String str[] = line.split(",");
			System.out.println(
					"Employee details are : name is " + str[0] + " Location is " + str[1] + " Hiredate is " + str[2]); // System.out.println(scanner.next());
																														// }

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}

			scanner.close();
		}

	}
}