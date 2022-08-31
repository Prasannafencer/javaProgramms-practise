package java_programs;

import java.util.LinkedHashSet;

public class number_occores_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to the india";
String str[]=s.split(" ");
LinkedHashSet<Object> set=new LinkedHashSet<Object>();
for(int i=0;i<s.length()-1;i++)
{
set.add(s.charAt(i));
}
for(Object set1:set)
{int count=0;
for(int j=0;j<s.length();j++)
{
if(set1.equals(s.charAt(j)))
{
	count++;
	}
}

if(count==1) {
System.out.print(set1+""+count);
}
}
		
		
	}

}
