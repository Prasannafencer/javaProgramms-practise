package array;

public class Array_sumOF_3max_num {
public static void main(String args[])
{
	
	{//get the 1st maximum number 1st put in desending order
		int[] a= {12,2,4,5,8};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}

			}
		
		}
		for(int i=0;i<3;i++)
			
		{
			sum=sum+a[i];}
		{
			System.out.println(sum);
					}
}
		

	}






}

