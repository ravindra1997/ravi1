package Training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo12 
{
	public static void main(String[] arg)
	{
		System.out.println("hello");
		
		//Pattern  pattern=Pattern.compile( ".*t.*",Pattern.CASE_INSENSITIVE);
		Pattern pattern2=Pattern.compile("[tT]im|[jJ]in");
		Matcher matcher=pattern2.matcher("\"Tim\"");// Pattern.matches("[tT]im|[jJ]in", ));
		if(matcher.find())
		{
			System.out.println("matcher");
		}
		else
		{
			System.out.println("sorry");
		}

	}

}
