package Day2;

public class StudentAggregation 
{
  String sname;
  int roll;
  DepartmentAggregation da;
public StudentAggregation(String sname, int roll, DepartmentAggregation da) {
	super();
	this.sname = sname;
	this.roll = roll;
	this.da = da;
}

public String toString() {
	return "StudentAggregation [sname=" + sname + ", roll=" + roll + ", da=" + da + "]";
}

  
}
