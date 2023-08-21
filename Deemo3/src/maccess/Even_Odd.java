package maccess;

import java.util.Scanner;

public class Even_Odd {
	public static void evenOdd(int a)
	{
		if(a%2==0)	
			System.out.println("Even no");
		else 
			System.out.println("Odd no");	
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = s.nextInt();
		evenOdd(n);
	}
}
