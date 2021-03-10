package String_Programs;

import java.util.Scanner;

public class AppendStrings 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of strings want to enter");
		int i1 = scanner.nextInt();
		int i2=i1+1;
		System.out.println("enter valuse siz eof " + i1);
		String s[] = new String[i2];
		StringBuffer s2=new StringBuffer();
		for (int i = 0; i <i2; i++)
		{
			
			s[i]=scanner.nextLine();
			
			s2.append(s[i]);
			
		}
		System.out.println(s2);
	}

	}


