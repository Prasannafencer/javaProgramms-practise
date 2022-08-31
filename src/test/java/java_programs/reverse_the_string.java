package java_programs;

public class reverse_the_string {
public static void main(String args[])
{
	int n=1253;
	
	int rev=0;
	if(n<9)		
	while(n!=0)

{
 int remainder=n%10;	
rev=rev+remainder;
n=n/10;
	}
System.out.println(rev);
}}

