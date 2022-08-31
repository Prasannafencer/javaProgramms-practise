package java_programs;

public class print_the_occ_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="a2v3a4";
	for(int i=0;i<s.length()-1;i++)
	{
		int n=s.charAt(i+1)-48;
		while(n>0)
		{
			
			System.out.print(s.charAt(i));
			n--;
 
		}
		i++;
		
	}
	
	}

}
