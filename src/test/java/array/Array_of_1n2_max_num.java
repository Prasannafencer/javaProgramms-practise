package array;

public class Array_of_1n2_max_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			{//get the 1st maximum number 1st put in desending order
				int[] a= {12,2,4};
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
				
				}System.out.println("first maximum number "+a[0]);
				System.out.println("second maximum number "+a[1]);
	}
				

			}

	}


