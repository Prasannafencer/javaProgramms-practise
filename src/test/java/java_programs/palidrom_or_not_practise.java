package java_programs;

public class palidrom_or_not_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=122;
int n2=n;
int temp=0;
{
while(n!=0) {
int remaindor=n%10;
temp=temp*10+remaindor;
n=n/10;
}
if(n2==temp)
{
System.out.println("yes");	

}else
{
System.out.println("no");	
}
	}
}}
