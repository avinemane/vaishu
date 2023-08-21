package demo;

import java.util.Scanner;

class StaticBlock{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String:");
		String str=sc.next();
		int len=str.length();
		String rev="";
		for(int i=0;i<len;i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);
		sc.close();
	}
}
