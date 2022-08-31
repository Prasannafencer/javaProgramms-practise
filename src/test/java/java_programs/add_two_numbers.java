package java_programs;

import java.util.LinkedHashSet;

public class add_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4};
int b[]= {2,3,4};
b[3]=3;
System.out.println(b[3]);
LinkedHashSet<Integer> a1=new LinkedHashSet<Integer>();
for(int i=0;i<a.length-1;i++)
{
	
boolean a2=a1.add(a[i]);
System.out.println(a2);
};
/**{
			
		if(a.length>b.length) {
		cl=a.length;
			b[a.length]=0;}

		else
		{
			cl=b.length;
		a[b.length]=0;	
		}
		for(int i=0;i<cl;i++)
		{
			int c=a[i]+b[i];
			System.out.println(c);
		}	
			**/
		}
	}


