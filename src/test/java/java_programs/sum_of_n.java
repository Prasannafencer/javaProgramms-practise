package java_programs;

import java.util.Scanner;

public class sum_of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int sum=0;
int n=sc.nextInt();
for(int i=1;i<=n;i++)
sum=sum+i;
System.out.println(sum);
	}
}
