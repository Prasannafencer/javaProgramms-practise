package java_programs;

import java.util.LinkedHashSet;

public class print_duplicate_words {
	public static void main(String args[]) {
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
	{
		int count=0;
		for(int i=0;i<spl.length;i++)
		{
			//step3;
			if(str.equals(spl[i]))
			{
				count++;
			}
			
	
}
		if(count>1)
		//step4;
		System.out.println(str+"" +count);
			
	}
	
	
	}

}
