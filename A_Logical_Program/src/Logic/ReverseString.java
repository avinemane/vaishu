package Logic;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String s = sc.next();
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1 = s1+s.charAt(i);
		}
		System.out.println(s1);
	}
}
