package FileIO;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class FileIo6
{
	public static void main(String...arg)
	{
		try {
		FileInputStream fileInputStream=new FileInputStream("D:\\tech.txt");
		FileInputStream fileInputStream2=new FileInputStream("C:\\\\Users\\\\d1\\\\chmv.txt");
		SequenceInputStream inputStream=new SequenceInputStream(fileInputStream,fileInputStream2);
		int i;
		while((i=inputStream.read())!=-1)
				{
			     System.out.print((char)i);
			
				}
		
		fileInputStream.close();
		fileInputStream2.close();
		inputStream.close();
		
		
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
