package java_programs;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class number_position_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  s="aabbbabc";

for(int i=0;i<s.leng th();i++)
{
	int count=1;

for(int j=i+1;j<s.length();j++)

{
	
if(s.charAt(i)==s.charAt(j))
{
	count++;
	i++;
}
else {
	break;
}

}
if(count==1)
System.out.println(s.charAt(i)+""+count);}

}

		
		
	}


