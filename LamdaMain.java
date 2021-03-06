package String_Programs;

public class LamdaMain {
	public static void main(String[] args) {
		LamdaMain l = new LamdaMain();
		Interface1 addition = (int a, int b) -> a + b;
		
		//In/*terface1 t=s -> System.out.println("hi");
	//	t.show("ravindra");*/

		//Interface1 i1=s-> System.out.println("hello "+s);
		
		Interface1 multiplication = (a, b) -> a * b;

		Interface1 division = (int a, int b) -> {
			return a / b;
		};

		Interface1 substraction = (int a, int b) -> a - b;

		System.out.println(l.operate(10, 2, substraction));
		//System.out.println(l.);
		System.out.println(l.operate(22, 10, multiplication));
		System.out.println(l.operate(5, 1, division));
		System.out.println(l.operate(12, 8, addition));

		Interface2 i2 = msg -> System.out.println("hello " + msg);
		Interface2 i3 = msg -> System.err.println("hello " + msg);

		i2.display("Gowtham");
		i3.display("Gowtham Polepaka");

	}

	private int operate(int a, int b, Interface1 i) {
		return i.run(a, b);
		
	}
	//private String operates(String s,Interface1 i1)
	{
		//return i1.show(s);
	}

}
