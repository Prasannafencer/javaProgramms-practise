package java_programs;

import java.util.LinkedHashSet;

public class print_across_chara_word {

	public static void main(String args[]) {
	String s="india";
	
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for(int i=0;i<s.length();i++)
	{
set.add(s.charAt(i));
}int count=0;

	//step2;
	for( Character ch:set)
	{
		
		for(int i=0;i<s.length();i++)
		{
			//step3;
			if(ch==s.charAt(i))
			{
				count++;
			}
			
	
		}
		//step4;
		System.out.print(ch+"" +count);
			
	}
	
	
	}

}
