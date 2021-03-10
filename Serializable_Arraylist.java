package FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializable_Arraylist {
	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("Ravindra");
		li.add("Gowtham");
		li.add("nag");
		List<String> li1;

		for (String li2 : li) {
			System.out.println(li2);
		}

		try {

			FileOutputStream fileOutputStream = new FileOutputStream("D:\\ravindras.txt");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(li);
			
			objectOutputStream.writeObject(li);

			fileOutputStream.close();

			objectOutputStream.close();

			System.out.println("success");

			/*
			 * FileInputStream fileInputStream = new FileInputStream("D:\\ravindra.txt");
			 * ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			 * List<String> li2=(List)inputStream.readObject();
			 */
			// int s = inputStream.read();
			// System.out.println((char) s);
			// System.out.println(li2);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
