package FileIO;

import java.io.FileWriter;
import java.io.Writer;

public class FileIo8 
{
	public static void main(String...arg)
	{
		System.out.println("hello world");
		try {
		Writer writer=new FileWriter("D:\\ tech23.txt");
		writer.write("Ravindra Yalla");
		writer.flush();//should use flush to push the data to file
		writer.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
