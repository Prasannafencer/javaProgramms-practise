package java_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class exit_onlu_twoline_avoid_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcomecome";
		LinkedHashSet<String> ha=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length();i++) 
			{
			for(int j=i+1;j<=s.length();j++)
			{
				String str=s.substring(i,j);
				if(str.length()==2) {
					ha.add(str);
					}
				
				}
			
				
		
	}
		for(String h:ha)
		System.out.println(h);
		
	}

}
