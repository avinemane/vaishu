package day_4;

import java.util.*;
public class Ex_19 {
	String rotate(String s1,int n)
	{
		String s="";
		if(n<0)
			s+=s1;
		else
			s+=s1.substring(s1.length()-n)
			+s1.substring(0,s1.length()-n);
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		System.out.println("Enter Rotatting Position: ");
		int n = sc.nextInt();
		Ex_19 e = new Ex_19();
		System.out.println(e.rotate(s, n));
	}
}
