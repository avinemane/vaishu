package day_4;

import java.util.*;
public class Ex_18 {
	
	String reverse(String s)
	{
		String s1="";
		String s2[] = s.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			for(int j=s2[i].length()-1;j>=0;j--)
			{
				s1=s1+s2[i].charAt(j);
			}s1=s1+" ";
		}
		return s1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		Ex_18 e = new Ex_18();
		System.out.println(e.reverse(s));
	}
}
