package java_programs;

import java.util.LinkedHashSet;

public class no_of_across_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to the india tha";
String str[]=s.split(" ");
int count=0;
for(int i=0;i<=s.length()-1;i++)	
{
	String temp=str[i];
	 {
		for(int j=i+1;j<s.length();j++)
		{
	if(str[i].equals(temp.charAt(j)))
	{
		count++;
	}
		}
		System.out.println(str+""+count);	
	 }}	
		}
		
	}

			
	


