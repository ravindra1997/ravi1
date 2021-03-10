package com.general;

import java.util.Optional;

public class Demo7 {

	public static void main(String...arg)
	{
		String[] str=new String[10];
		Optional<String> st=Optional.ofNullable(str[5]);
		if(st.isPresent()) {
		//System.out.println(st);
			String s=str[5].toLowerCase();
			System.out.println(s);
		}
		else
		{
			System.out.println("sorry");
		}
		
		//System.out.println(s);
	}
}
