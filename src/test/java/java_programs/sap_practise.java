package java_programs;

public class sap_practise {

	public static void main(String args[])
	{
		
		int n=16;
		
		int sum=0;
		int rem;
		for(int i=0;i<n;i++)
		{
			rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
	}
		if(n==1) {
		System.out.println("not a prime");
		}
		else {
			
			
			System.out.println("prime");
		}
	}
}
