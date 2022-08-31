package java_programs;

public class All_posible_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="javapythonjavaseleniumjava";
		String s1="java";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s1.length();j++)
			{
				
				String res=s.substring(i, j);
				if(s1.equals(res))
					count++;
			}
			
		}

	System.out.println(s1+" "+count);
	}

}
