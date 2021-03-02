package Day2;

public class College extends University
{
	public College(String uname, String location) {
		super(uname, location);
		
	}
	public void run()
	{
		super.run();
		System.out.println("running compitation");
	}
	public void test()
	{
		System.out.println("test result");
	}
	@Override
	public String toString() {
		return "College [uname=" + uname + ", location=" + location + "]";
	}
	

}
