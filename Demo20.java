package String_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Demo20
{
	public static void main(String...arg) {
	/*Random random = new Random(1000);
	random.

	System.out.println(random);}
*/
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
	}
}
