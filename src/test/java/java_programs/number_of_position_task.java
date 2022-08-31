package java_programs;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class number_of_position_task {

	public static void main(String args[]) {
		String s="aabbbcab";
		
		s=s.toLowerCase();
		//step1
		LinkedList<Character> set=new LinkedList<Character>();
		
		for(int i=0;i<=s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
		
	
			set.add(s.charAt(j));
	}

for( Character ch:set)
		{
	int count=0;
			for(int i=0;i<=s.length();i++)
			{
				if(ch==s.charAt(i)) {
					count++;
			
			System.out.print(ch+"="+count);
			
			}}}}}
