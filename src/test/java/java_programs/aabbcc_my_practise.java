package java_programs;

public class aabbcc_my_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="aabbcc";
System.out.println("length"+s.length()+"index"+s.charAt(0));

for(int i=0;i<=s.length()-1;i++)
{int count=0;
for(int j=i+1;j<s.length();j++)

{
	if(s.charAt(i)==s.charAt(j))
		count++;
	else {
		
		break;
	}
	System.out.println(s.charAt(i)+""+count++);	
}

}
	}

}
