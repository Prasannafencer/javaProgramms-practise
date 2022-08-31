package java_programs;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;



public class Reverse_the_amit_pro {

	
	public static void main(String args[])
	{
	String s="welcome to the textyantra";
	String spl[]=s.split("");
	
	for(int i=0;i<spl.length;i++ )
	{
String s1=spl[i];	
	for(int j=s1.length()-1;j>=0;j--)
	{
		
		char str=s1.charAt(j);
		System.out.print(str);
		}
	System.out.print("");
	}

	}
	
	
}
