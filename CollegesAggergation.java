package Day2;

import java.util.List;

public class CollegesAggergation
{
	List<Colleges> college;
	List<Location> loc;
	StudentAggregation stu;
	
	public CollegesAggergation(List<Colleges> college,List<Location> loc,StudentAggregation stu)
	{
		this.college=college;
		this.loc=loc;
		this.stu=stu;
	}

	public String toString() {
		return "College[coll=" + college + ", loc=" + loc + ", stu=" + stu + "]";
	}
	
}
