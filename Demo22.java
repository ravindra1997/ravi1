package String_Programs;

import java.util.Arrays;
import java.util.List;

public class Demo22 
{
	List number = Arrays.asList(2,3,4,5);
	int even = (int) number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

}
