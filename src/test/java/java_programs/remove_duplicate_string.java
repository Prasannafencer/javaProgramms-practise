package java_programs;

import java.util.LinkedHashSet;

public class remove_duplicate_string {
public static void main(String args[]) {
	String s="india";
LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
	for(int i=0;i<s.length();i++)
	{
set.add(s.charAt(i));
}

	//step2;
	for( Character ch:set)
	{
		System.out.print(ch);
		}}

}
