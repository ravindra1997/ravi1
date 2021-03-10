package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileFromOneTwoAnother
{
	public void copy(File a,File b)
	{
		try {
		FileInputStream fileInputStream=new FileInputStream(a);
		FileOutputStream fileOutputStream=new FileOutputStream(b);
		
		int l;
		
		while((l=fileInputStream.read())!=-1)
		{
			fileOutputStream.write(l);
		}
		fileInputStream.close();
		fileOutputStream.flush();
		fileOutputStream.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("successfully copied");
		
		
	}
	public static void main(String[] arg)
	{
		
	}

}
