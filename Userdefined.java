package FileIO;

import java.io.Serializable;

public class Userdefined implements Serializable
{
	String name;
	String location;
	int  salary;
	public Userdefined(String name, String location, int salary) {
		super();
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "File9 [name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	

}
