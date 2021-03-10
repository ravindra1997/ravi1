package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileIo2 
{
	public static void main(String...arg)
	{
		System.out.println("Hello");
		try {
		FileReader fileReader=new FileReader("C:\\Users\\d1\\new.csv");
	    System.out.println(	fileReader.read());
	    BufferedReader bufferedReader=new BufferedReader(fileReader);
	    String line="";
	   	    while((line=bufferedReader.readLine()) != null)
	    {
	   	     String str[]=line.split(",");

	    	System.out.println(str[0]+str[1]+str[0]);
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
