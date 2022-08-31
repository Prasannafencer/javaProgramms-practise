package array;

public class happy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=94;
		int r=0;
		int sum=0;
		while (n>9)
		{
		while(n>0)
		{
		r=n%10;  
		sum=sum+(r*r);
		n=n/10;
		}
		}
		n=sum;
		sum=0;
		
		if(n==1)
		{
		System.out.println("happa number");
		}
		else{
		System.out.println("not a happy nmber");
		}
		}


	}

