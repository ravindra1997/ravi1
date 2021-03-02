package Day2;

import java.util.List;

public class Aggregation
{
	List<CollegesAggergation> cl;
	String university;
	public Aggregation(List<CollegesAggergation> cl, String university) {
		super();
		this.cl = cl;
		this.university = university;
	}
	public String toString()
	{
		return "University "+university+"and the colleges are "+cl;
	}

}
