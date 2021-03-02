package com.techouts.day3;

public class InvokePoly
{
	void invoke(Polymorphism1 p)
	{
		if(p instanceof Poly2)
		{
			Poly2 poly2=(Poly2) p;
			poly2.rigth();
		}
		if(p instanceof Poly1)
		{
			Poly1 poly1=(Poly1)p;
			poly1.wrong();
		}
	}

}
