package FileIO;

import java.io.FileWriter;

public class FileIo4
{
	public static void main(String...arg)
	{
		try {
		FileWriter fileWriter=new FileWriter("‪‪C:\\Users\\d1\\ok.txt");
		System.out.println("hi");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
