package Day2;

public class MLoading 
{
	int a;
	int b;
	public MLoading()
	{
	System.out.println("in first constructor");
	}
	public MLoading(int a,int b)
	{
		this();
	}
		
	
	public int addition(int n,int m)
	{
       return n+m;
	}
	public double multiplication(int n,int m)
	{
		return n*m;
	}
	public double substraction(int n,int m)
	{
		return n-m;
	}
	public int addition(int n,int m,int p)
	{
		return n+m+p;
	}
public static void main(String [] arg)
{
	MLoading loading=new MLoading();
	System.out.println(loading.addition(12, 9));
	System.out.println(loading.addition(10, 20,30));
	
}
}
