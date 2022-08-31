package java_programs;

public class Reverse_the_string_without_lenthg {

public static void main(String args[])
{
	String s="india to";
	String rev="";
	int count=s.compareTo(rev);
	System.out.println(count);
for(int i=count-1;i>=0;i--) 
{
	rev=rev+s.charAt(i);
	}	
System.out.print(rev);
}
}
