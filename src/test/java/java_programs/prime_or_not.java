package java_programs;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enetre the number");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<n;i++)
	
{
if(i%2==0&i!=2)
{
	sum=sum+i;
}

		
}System.out.println(sum);	
		
	}

}
