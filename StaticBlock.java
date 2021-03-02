package Training;

public class StaticBlock
{
	 static int i=10;
	String s="ravindra";
	/*
	 * public StaticBlock(int i) { this.i=i; }
	 */	
   static {
	   System.out.println("h");
	  // System.out.println(new StaticBlock(10).s);
	   System.out.println(i);
   }
	
	
	public static void main(String[] args)
	{
	System.out.println(StaticBlock.i);
		
		
		//StaticBlock block=new StaticBlock(20);
		/*System.out.println(block.i);
		System.out.println(new StaticBlock(10).i);
		System.out.println(new StaticBlock(12).i);
		*/
	}

}
