package FileIO;

import java.io.FileReader;
import java.io.Reader;

public class Readers
{
	public static void main(String...arg)
	{
		System.out.println("welcome Mr");
		try {
		Reader reader=new FileReader("D:\\ tech23.txt");
		
		int i;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
			//i=reader.read();
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
