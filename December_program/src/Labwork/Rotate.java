package Labwork;

import java.util.Scanner;

public class Rotate {
	public String RotateString(String s1,int a) {
		String s2="";int b=s1.length();
		for(int i=b-a;i<b;i++) {
			s2+=s1.charAt(i);
		}
		for(int i=0;i<b-a;i++) {
			s2+=s1.charAt(i);
		}
		return s2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1=sc.next();
		System.out.println("Enter a Number: ");
		int a=sc.nextInt();
		Rotate r=new Rotate();
		System.out.println(r.RotateString(s1,a));
	}
}

