package day_2;

import java.util.*;

public class Program1 {
	@SuppressWarnings("null")
	String rearrangeCharacters(String s)
	{
		String b="";
		for(int i=0;i<s.length();i++)
		{
			char[] ch = null;
			ch[i]=s.charAt(i);
		}
		return b;
	}
	
	
	
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		 
		char ch = sc.next().charAt(0);
		Program1 p = new Program1();
		System.out.println(p.rearrangeCharacters(s));
	}
}
