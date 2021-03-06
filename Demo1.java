package String_Programs;

public class Demo1 implements Runnable {
	String name;
	String ph;

	public Demo1(String name, String ph) {
		this.name = name;
		this.ph = ph;
	}
	public void run() {
		// start();
		walk();
		end();

	}
	// public void start() { System.out.println("thank you thread"); }

	synchronized public void end()  {

		System.out.println("after ehehe");
		System.out.println(name + " " + ph);
		System.out.println("hell world");
	}

	synchronized public void walk() {
		System.out.println("ehehe");
		//notify();
	}

}
