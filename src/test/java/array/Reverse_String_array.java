package array;

import java.util.LinkedHashSet;

public class Reverse_String_array {
	public static void main(String args[])
	{
		String s="welcome to tyss";
		String[] spl = s.split(" ");
		//step1
		for(int i=spl.length-1;i>=0;i--)
		{
	System.out.print(spl[i]+" ");
	}
	

}}
