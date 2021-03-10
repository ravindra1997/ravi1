package String_Programs;

public class JoinExp extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		//Thread.yield();
	}

	public static void main(String[] args) throws InterruptedException {
		

		JoinExp j = new JoinExp();
		JoinExp j1 = new JoinExp();
		JoinExp j2 = new JoinExp();
		j.start();
		{
			j.join();

		}

		j1.start();
		j2.start();
		System.out.println(j.getName());
		System.out.println(j1.getName());

		j2.setName("ravindra_Thread");
		j1.setPriority(MAX_PRIORITY);
		System.out.println(j.getPriority());

		System.out.println(j2.getName());
	}

}
