package com.general;

public class Pattern6 
{
	public static void main(String...arg)
	{

	       int star=5;
	       int space=0;
	       for (int i = 1; i <=9; i++)
	       {
	    	    if (i<=5)
	    		   {
	    			  star--; 
	    			  space++;
	    		   }
	    		   else
	    		   {
	    			   star++;
	    			   space--;
	    		   }
	    		   for (int j2 = 1; j2 <=star; j2++)
	    		   {
	    			  System.out.print("*");
	    		   } 
	    		   
	    		   for (int j = 1; j <space; j++) 
	    		   {
	    			   System.out.print(" ");
	    		   }
	    		   
	    		   for (int j = 1; j <space; j++) 
	    		   {
	    			   System.out.print(" ");
	    		   }
	    		   for (int j = 1; j <=star; j++)
	    		   {
	    			   System.out.print("*");
	    		   }
	    	           System.out.println();
	    	   }
		
	}
}
