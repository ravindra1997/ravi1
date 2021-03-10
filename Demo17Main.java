package String_Programs;

import java.util.ArrayList;

public class Demo17Main {
	public static void main(String... arg) {
		Demo17 demo17 = (s) -> {
			
			for (int i = 1; i < 11; i++) {
				System.out.println(i+" "+s);
			}

			System.out.println("hello world");
		};
		demo17.loop("ravindra");
		Demo17 d=(b)->{
			for(int i=1;i<6;i++)
			{
				System.out.println(i+" "+b);
			}
			
		};
		d.loop("chmvr");
		//Demo17Main demo17Main=new Demo17Main();
		//demo17Main.display(d.loop("chmr"););
	}
	
	/*
	 * public void display(Demo17 i) { System.out.println("Namste"); //return
	 * i.loop(s); }
	 */
}
