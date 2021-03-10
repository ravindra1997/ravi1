package String_Programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class dEMO24 
{
public static void main(String...arg)
{
	File file=new File("ravindra.txt");
	try {
	FileWriter fileWriter=new FileWriter("ram.txt");
	
		fileWriter.append('r');
		fileWriter.write("Welcome world");;
		
		fileWriter.flush();
		fileWriter.close();
		System.out.println("hello");
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}

}
