package java_programs;

import java.util.HashSet;

public class number_of_acros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[]= {1,2,3,3,4,5,4,4};

HashSet<Object> n1=new HashSet<Object>();
for(int i=0;i<n.length;i++)
{
	n1.add(n[i]);
}
for(Object n3:n1)
	
{int count=0;
	for(int j=0;j<n.length;j++)
	{
		
		if(n3.equals(n[j]))
		{
			count++;
			
		}
	}	System.out.println(count+"="+n3);
	

}
	

		
		
	}

}
