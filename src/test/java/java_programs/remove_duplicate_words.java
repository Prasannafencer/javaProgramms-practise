package java_programs;

import java.util.LinkedHashSet;

public class remove_duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to to the india";
		String[] spl = s.split(" ");
		//step1
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<spl.length;i++)
		{
	set.add(spl[i]);
	}

		//step2;
		for( String str:set)
		
			//step4;
			System.out.print(str+" ");
				
		}
		
		
		}

	


