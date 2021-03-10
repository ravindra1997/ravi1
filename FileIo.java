package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIo {
	public static void main(String[] arg) {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader("C:\\Users\\d1\\chmv.txt"));
			String line = "";
			String l = bufferedReader.readLine();
			String st[] = l.split(",");

			for (int i = 0; i < st.length; i++) {
				System.out.print(st[i]);
			}

			System.out.println();
			while ((line = bufferedReader.readLine()) != null) {
				String str[] = line.split(",");

				System.out.println("Employee details are : name :" + str[0] + " MailId : " + str[1] + " Phonenum :"
						+ str[2] + " password: " + str[3]); // System.out.println(scanner.next()); }

				String s = "Harish";
				if (s.equals(str[0])) {
					System.out.println("yes");
				}

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
