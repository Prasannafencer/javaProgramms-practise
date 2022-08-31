package java_programs;

public class Segrigate_nu_al_spl {

	public static void main(String args[])
	{
		String s="rhn122&&ASC";
		String al="";
		String nu="";
		String spl="";
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)>=97&&s.charAt(i)<=122 || s.charAt(i)>=65&&s.charAt(i)<=90)
		{
			al=al+s.charAt(i);
			
		}
		else if(s.charAt(i)>=48&&s.charAt(i)<=57)
		{
			nu=nu+s.charAt(i);
			
		}
		else {
			
		spl=spl+s.charAt(i);
		}
	}
		System.out.println(al);
		System.out.println(nu);
		System.out.println(spl);
		
	}}
