package String_Programs;

import java.util.Scanner;

public class CamelCaseToSnakeCase 
{
			public static void main(String[] args) {
			
				
			Scanner  scanner=new Scanner(System.in);
			String s=scanner.nextLine();
			//String s="KariM is a tester";
			String str="";
			for(int i=0;i<s.length();i++)
				
			{
				//char ch=s.charAt(i);
				if(s.charAt(i)==' ')
				{
					str=str+"_";
				}
				else
				{
					str=str+Character.toLowerCase(s.charAt(i));
				}
				}
			System.out.println(str);
			
		}

	}



