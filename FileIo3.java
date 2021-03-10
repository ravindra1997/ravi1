package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.stream.Collectors;

public class FileIo3 
{
	public static void main(String...arg)
	{
		
		try {
		
			FileWriter fileWriter=new FileWriter("C:\\Users\\d1\\new.csv",true);
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			String line="";
			bufferedWriter.append("ravindra");
			//bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
			System.out.println("success");
		}
		catch(Exception exception) {
			exception.printStackTrace();
		}
	}
		

}
