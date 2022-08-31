package java_programs;

import java.util.LinkedHashSet;

public class no_acros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="prasanna";
	LinkedHashSet<Character> str=new LinkedHashSet<Character>();
	for(int i=0;i<s.length()-1;i++)
	{
		str.add(s.charAt(i));
		}
	for(Character str1:str)
	{
		int count=0;
		for(int j=0;j<s.length();j++)
		{
	if(str1==s.charAt(j))
	{
		count++;
		
	}
		}
		if(count==1) {
		System.out.println(count+""+str1);
		}
		}}
	
	}

