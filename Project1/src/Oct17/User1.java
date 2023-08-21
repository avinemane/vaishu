package Oct17;

import java.util.Scanner;

import Oct15.Example17;

public class User1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		Ex20 e1 = new Ex20();
		String c = e1.checkPrime(a);
		System.out.println(c);
	}
}


