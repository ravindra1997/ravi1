package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class WriteInCsv 
{
	
	public void test(Userdefined j)
	{
		try {
			/*
			 * FileWriter fileWriter=new FileWriter("D:\\demo.csv"); String str[]=
			 * {"ravindra","harish","rocky"}; fileWriter.write("ravindra");
			 * fileWriter.write("\n"); fileWriter.write("harish"); fileWriter.append('A');
			 * fileWriter.flush(); fileWriter.close(); System.out.println("success");
			 */

			
			FileOutputStream fileOutputStream=new FileOutputStream("D:\\demo1.csv");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(j);
			objectOutputStream.flush();
			objectOutputStream.close();
			System.out.println("object successfully saved in file");
			
			
		
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String...arg)
	{
		WriteInCsv csv=new WriteInCsv();
		Userdefined file9=new Userdefined("Harish", "EdenPark", 20000);
		
		csv.test(file9);
	}

}
