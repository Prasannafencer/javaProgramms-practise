package java_programs;

public class avoid_duplicate_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to the the textyantra";
String []spl=s.split("");
for(int i=0;i<=s.length()-1;i++)
{
	String temp=spl[i];
	int count=0;
	for(int j=0;j<=s.length()-1;j++)
{
	if(temp.charAt(j)==s.charAt(j))
	{
		count++;
		
	}
	
}
if(count==1)
{
System.out.println(temp);	
}
}

}
	}

