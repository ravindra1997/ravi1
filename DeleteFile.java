package FileIO;

import java.io.File;

public class DeleteFile
{
	public static void main(String...arg)
	{
		File file=new File("D:\\tech4.txt");
		if(file.delete())
		{
			System.out.println("file "+file.getName()+" deleted");
			
		}
		else
		{
			System.out.println("not deleted");
		}
	}

}
