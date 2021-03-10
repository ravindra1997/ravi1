package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Input {
	public static void main(String... arg) {
		System.out.println("Hello");
		try {
			/*
			 * FileInputStream fileInputStream = new FileInputStream("D:\\tech4.txt");
			 * ObjectInputStream inputStream = new ObjectInputStream(fileInputStream); //int
			 * s = inputStream.read(); int s; while((s=inputStream.read())!=-1) {
			 * System.out.println(s); }
			 * 
			 * System.out.println(s);
			 */
			FileOutputStream fileOutputStream = new FileOutputStream("D:\\tech4.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject("subanallah");
			objectOutputStream.writeObject("rockstar");
			String s = "ravindra";
			byte b[] = s.getBytes();
			fileOutputStream.write(b);

			objectOutputStream.flush();
			fileOutputStream.flush();
			fileOutputStream.close();
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
