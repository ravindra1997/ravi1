package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo 
{
	public static void main(String[] args) throws IOException {
		
		// creating a new file
		
		File file = new File("data1.txt");   
		
		try
		{
			boolean createNewFile  = file.createNewFile();
			System.out.println("new file created :"+ createNewFile);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		// deleting the file
		
		/*boolean Delete = file.delete();
		System.out.println("delete file : "+ Delete);
	    */
		
		// reading from the file
		
		File file1 = new File("data1.txt");
		FileInputStream fis = new FileInputStream(file1);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		
		while((line = br.readLine())!= null)
		{
			System.out.println(line);
		}
		
		br.close();
		
		// Writing to the file
		
		try {
			FileWriter fw = new FileWriter("data1.txt");
			fw.write(" writing a file ");
		}
		catch(Exception e)
		{
		 e.printStackTrace();	
		}
		
		// Append a file 
		

	}

}





