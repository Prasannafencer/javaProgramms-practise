package java_programs;

import java.util.LinkedHashSet;

public class print_only_uniqe_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		//step1
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
	set.add(s.charAt(i));
	}

		//step2;
		for( Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				//step3;
				if(ch==s.charAt(i))
				{
					count++;
				}
				
		
	}
			//step4;
			if(count==1)
			System.out.print(ch);
				
		}
		
		
		}

	}


