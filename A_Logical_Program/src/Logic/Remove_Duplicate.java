package Logic;

import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String s = sc.next();
		String s1="";
		for(int i=s.length();i>=0;i--)
		{
			s1=s1+s.charAt(i);
			for(int j=s.length();j==i;j--)
			{
				s1=s1+s.charAt(i);
				if(i==j)
					j--;
					
			}
			System.out.println(s1);
		}
		System.out.println(s1);
	}

}
