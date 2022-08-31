package java_programs;

import java.util.Scanner;

public class number_of_multipl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=10;j++)
		{
			
			System.out.println(j+"*"+n+"="+(j*i));
			
			
		}
		System.out.println(i+"table");
		System.out.println("____________");
		
		
	}
	
	}

}
