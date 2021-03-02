package Day2;

import java.util.ArrayList;
import java.util.List;

public class CompositionMain 
{
	public static void main(String []arg)
	{
		System.out.println("Hello World");
		Composition composition=new Composition("WallStreet", "harish");
		Composition composition2=new Composition("GoneGirl","Christofer");
		
		List<Composition> c=new ArrayList<Composition>();
		c.add(composition);
		c.add(composition2);
		
		Composition2 composition22=new Composition2(c);
		System.out.println(composition22);
	}

}
