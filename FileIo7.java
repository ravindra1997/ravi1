package FileIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileIo7 
{
	public static void main(String[] arg)
	{
		System.out.println("hello");
		try {
		FileInputStream fileInputStream=new FileInputStream("D:\\\\ravindras.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		
		
		
		int i;
		while((i=objectInputStream.read())!=-1)
		{
			System.out.println((char)i);
		}
		
		
		
		
		
		
		
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
	}
		}

}
