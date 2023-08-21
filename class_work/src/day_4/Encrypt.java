package day_4;

import java.util.Scanner;

public class Encrypt {
	
	String encrypt(String s)
	{
		s=s.toLowerCase();
		
		char ch[] = s.toCharArray();
		String s1="";
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(122-(ch[i]-97));
			s1=s1+ch[i];
		}
		
		return s1;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		Encrypt e = new Encrypt();
		System.out.println(e.encrypt(s));
	}
}
