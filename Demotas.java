package Training;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demotas 
{
	public static void main(String[] args) {
		System.out.println("enter phonenumber");
		Scanner scanner=new Scanner(System.in);
        String phonenumber=scanner.next();
        if(Pattern.matches("\\d{10}",phonenumber))
        {
        	System.out.println("hello");
        }
        else
        {
        	System.out.println("bye");
        }
	}

}
