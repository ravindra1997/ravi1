package FileIO;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModified 
{
	public static void main(String[] arg)
	{
		File file=new File("D:\\tech.txt");
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		/*
		 * Date date=new Date(); System.out.println(date);
		 * System.out.println(formatter.format(date));
		 */
	    //use setReadOnly() method to make file read only if needed
	    
	    //use canWrite to check whether file can writable or not
	    
	    System.out.println(formatter.format(file.lastModified()));
	    
	}

}
