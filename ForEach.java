package day1;

import java.util.Scanner;

public class ForEach 
{
public static void main(String[] args) {
	Scanner  scanner=new Scanner(System.in);
	int size=scanner.nextInt();
	System.out.println("enter the elemens of size="+size);
	int k[]=new int[size];
	for(int i=0; i<=size-1;i++) {
		k[i]=scanner.nextInt();
	}
	for(int i=0; i<=size-1;i++)
	{
		System.out.println(k[i]);
	}
	for (int j : k)
	{
		System.out.println(j);
		
	}
}

}
