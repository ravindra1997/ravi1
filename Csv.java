package com.general;

import java.io.FileWriter;
import java.io.IOException;

public class Csv 
{
	public static void main(String...arg)
	{
		System.out.println("add it ");
		String csvfile="C:\\\\Users\\\\d1\\\\chmvr.csv";
		
		try {
			FileWriter fileWriter=new FileWriter(csvfile);
			
			fileWriter.append("steve");
			fileWriter.append(",");
			fileWriter.append("steve@gmail.com");
			
			fileWriter.append("1234569870");
			fileWriter.append("edwin");
			
			
			
			System.out.println("success");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
