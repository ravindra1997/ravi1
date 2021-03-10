package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializedArrayList {
	public static void main(String[] args) {

		try {
			/*
			 * FileInputStream fileInputStream=new FileInputStream("ravindra");
			 * 
			 * ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
			 * 
			 * ArrayList<String> ar=(ArrayList<String>) inputStream.readObject();
			 * 
			 * System.out.println(ar);
			 */

			FileInputStream fileInputStream = new FileInputStream("D:\\ravindra.txt");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			List<String> li2 = (List) inputStream.readObject();

			int s = inputStream.read();
			System.out.println((char) s);
			System.out.println(li2);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
