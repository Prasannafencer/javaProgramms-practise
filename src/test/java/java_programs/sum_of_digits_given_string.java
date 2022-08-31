package java_programs;

public class sum_of_digits_given_string {
public static void main(String args[]) {
	String s="abamaa48";
	int sum=0;
	for(int i=0;i<s.length();i++)
		if(s.charAt(i)>=48 && s.charAt(i)<=57)
		{
			int n=s.charAt(i)-48;
			sum=sum+n;
		}
	System.out.println(sum);
}
}
  