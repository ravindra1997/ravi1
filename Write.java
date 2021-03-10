package FileIO;

import java.io.FileWriter;
import java.io.Writer;

public class Write
{
	public static void main(String[] args) {
		try {
		Writer writer=new FileWriter("ravi");
		
		//writer.
		writer.write("techouts ravindra");
		writer.flush();
		writer.flush();
		System.out.println("successfully saved");
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
