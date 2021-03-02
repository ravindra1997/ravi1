package Day2;

public class TaskMain 
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
		College college=new College("Giet", "JNTU");
		Task task=new Task("IIM", college);
		System.out.println(task.result("RAJAMUNDRY", 11));
		System.out.println(task.name(college));
		college.run();
		college.test();
		
	}

}
