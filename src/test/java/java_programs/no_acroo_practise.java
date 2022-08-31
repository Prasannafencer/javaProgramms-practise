package java_programs;

import java.util.LinkedHashSet;

public class no_acroo_practise {

	public static void main(String[] args) 
	{
			String s="indiai";
			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			for(int i=0;i<s.length();i++)
			{
			set.add(s.charAt(i));
			}
			for( Character str:set)
			{
				int count=0;
				for(int j=0;j<s.length();j++)
				{
					
					//step3;
					
					if(str==s.charAt(j))
					{
						count++;
						
					}
				}
				System.out.println(str+"" +count);
			}
	}
					
					
					
					
}


