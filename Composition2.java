package Day2;

import java.util.List;

public class Composition2
{
	List<Composition> bo;
	public Composition2(List<Composition> bo)
	{
		this.bo=bo;
	}
	public List<Composition> getBo()
	{
		return bo;
	}
	@Override
	public String toString() {
		return "BookDeatails Are bo=" + bo ;
	}
	

}
