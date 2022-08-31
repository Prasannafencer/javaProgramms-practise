package java_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class number_of_acros_in_string {

	public static void main(String []args) {
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
				System.out.println(str+"" +(i+1));
						
			}
			
	
}
		//step4;
			
	}
	
	
	}
}
