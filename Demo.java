package String_Programs;

import java.util.HashMap;

public class Demo {
	static HashMap<Integer, String> d = new HashMap<Integer, String>();

	HashMap<Integer, String> h = new HashMap<Integer, String>();

	public void mais() {

		
		h.put(1, "onehi");
		h.put(2, "two");
		h.put(3, "three");
		h.put(4, "four");
		// for(Map.Entry m : h.entrySet()){
		// System.out.println(m.getKey()+" "+m.getValue());

		d.putAll(h);
		//System.out.println(d);

		// }
	}

	public void mais2() {
		mais();
		
		Demo demo = new Demo();
	   // HashMap<Integer, String> h1=demo.d;
		HashMap<Integer, String> f = new HashMap<Integer, String>();
		f.putAll(d);
		System.out.println(f);

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.mais2();
	}
}
