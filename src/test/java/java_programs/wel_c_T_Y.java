package java_programs;

public class wel_c_T_Y {

	public static void main(String[] args) {
		

	String s="Welcome to the test yantra";
	String spl[]= s.split(" ");
	for(int i=0;i<=spl.length-1;i++)
	{
		
		String str=spl[i];
		if(i==1||i==3) {
			
			for(int j=str.length()-1;j>=0;j--)
				{
				System.out.print(str.charAt(j));
	}
			System.out.print(" ");}
		
		else {
			
			System.out.print(spl[i]+" ");
			
		}
		System.out.print(" ");
	}}

}
