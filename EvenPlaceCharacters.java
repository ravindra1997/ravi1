package String_Programs;

import java.util.Scanner;

public class EvenPlaceCharacters {
	public static void main(String[] args) {
		System.out.println("please enter the word which you want");

		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String s2="";
		String s3="";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (i % 2 == 0) {
				
				s2=s2+ch+" ";
			}
			if(i%2!=0)
			{
				s3=s3+ch+" ";
			}
		}
			System.out.println("Odd places letters are");
			System.out.print(s2);System.out.println();
			System.out.println("Even places letters are");
			System.out.println(s3);

		}
			
			
			
			
			
	}

	
