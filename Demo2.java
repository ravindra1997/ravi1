package FileIO;

import java.io.Console;

public class Demo2 
{
public static void main(String...arg)
{
	/*
	 * Console console=System.console(); System.out.println("enter your name");
	 * String name=console.readLine(); System.out.println("welcome "+name);
	 */
	//public static void main(String args[]){    
		Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n=c.readLine();    
		System.out.println("Welcome "+n);    
		}    

}
