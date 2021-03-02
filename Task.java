package Day2;

public class Task
{
    int i=10;
	String s;
	College c;
	String s2="ravindra";
	public Task(String s, College c) {
		super();
		this.s = s;
		this.c = c;
	}
	public String result(String s, int i)
	{
		this.s=s;
		this.i=i;
		return s+""+i;
	}
	public College name(College c)
	{
		this.c=c;
		this.s2=s2;
		return c;
	}
	@Override
	public String toString() {
		return "Task [c=" + c + "]";
	}
	
	

}
