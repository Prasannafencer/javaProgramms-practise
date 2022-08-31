package java_programs;

public class exit_onlu_two_line_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		for(int i=0;i<s.length();i++) 
			{
			for(int j=i+1;j<=s.length();j++)
			{
				String str=s.substring(i,j);
				if(str.length()==2)
			System.out.println(str);
		
	}

}}}
	