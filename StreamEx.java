package String_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx 
{
	public static void main(String[] args) 
	{
		System.out.println("hello stream");
		List<Integer> li=Arrays.asList(10,20,30,40);
		//using map method
		List<Integer> li1=li.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(li1);
		
		
	}

}
