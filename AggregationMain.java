package Day2;

import java.util.ArrayList;
import java.util.List;

public class AggregationMain
{
	public static void main(String[] arg)
	{
		DepartmentAggregation aggregation=new DepartmentAggregation("CSE");
		StudentAggregation aggregation2=new StudentAggregation("Ravindra", 1455, aggregation);
		//CollegesAggergation aggergation1=new CollegesAggergation("Giet", "RJY");
		/*
		 * CollegesAggergation ag=new CollegesAggergation("IIT","HYD");
		 * CollegesAggergation ag1=new CollegesAggergation("BVC","VIZAG");
		 */
		Colleges college=new Colleges("GIET");
		Colleges college2=new Colleges("BVC");
		Colleges college3=new Colleges("IIM");
		
		List<Colleges> li=new ArrayList<Colleges>();	
		li.add(college);
		li.add(college2);
		li.add(college3);
		
		Location loc=new Location("RJY");
		Location loc1=new Location("HYD");
		Location loc2=new Location("BLR");
		
		List<Location> li1=new ArrayList<Location>();
		li1.add(loc);
		li1.add(loc1);
		li1.add(loc2);
		
		
		CollegesAggergation aggergation=new CollegesAggergation(li, li1, aggregation2);
		System.out.println(aggergation);
		
	}

}
