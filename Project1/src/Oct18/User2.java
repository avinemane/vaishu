package Oct18;

import java.util.Scanner;

import Oct17.Ex20;

public class User2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Ex21 e1 = new Ex21();
		String c = e1.checkPalindrome(a);
		System.out.println(c);
	}
}


