package array;

public class array_primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int  a[]= {2,3,4,5,6,7,8,9};
for(int i=0;i <a.length;i++)
{int n=a[i];
int j=2;
while(n>0) 
{
if(n%j==0)
{
break;
}
else
{
i++;	
}}
if(i==j){
	System.out.println("prime"+a[i]);
	
}
else {
	
	System.out.println("not a prime"+a[i]);
}
}
	}

}
