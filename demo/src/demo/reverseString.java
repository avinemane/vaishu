package demo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any String:");
		String str=sc.nextLine();
		String reverse="";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			String stn=st.nextToken();
		    int len=stn.length();
			String rev="";
			for(int i=0;i<len;i++) {
				rev=stn.charAt(i)+rev;
		     }
			reverse=" "+rev+reverse;
		}
		System.out.println(reverse);
		
	}

}
