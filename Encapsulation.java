package Training;

public class Encapsulation
{
	private String s;
	private int i;
	private String w;
	public String getS()
	{
		return s;
	}
	public void setS(String s)
	{
		this.s=s;
	}
	public int getI()
	{
		return i;
	}
	public void setI(int i)
	{
		if(i<10)
		{
		this.i=i;
		}
		else
		{
			System.out.println("enter the number correctly");
		}
	}
	public String getW()
	{
		return w;
	}
	public void setW(String w)
	{
		if(w.length()<=10) {
			this.w=w;
		}
		else
		{
			System.out.println("enter another word");
		}
			
	}
	

}
