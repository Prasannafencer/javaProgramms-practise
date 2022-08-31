package java_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class number_position_reverse {
	public static void main(String args[]) {
		String s="aabbbcab";
		
		s=s.toLowerCase();
		//step1
		LinkedList<Character> set=new LinkedList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
	set.add(s.charAt(i));
	}
		System.out.println(set);
for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{  
				if(ch==s.charAt(i))
			System.out.println
			(ch+"="+(i));
				
			}}}
}
