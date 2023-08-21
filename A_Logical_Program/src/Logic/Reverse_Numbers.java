package Logic;

import java.util.Scanner;

public class Reverse_Numbers {
	public static void main(String[] args) {
		int num,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		num = sc.nextInt();
		while(num!=0)
		{
			int remainder = num%10;
			rev = rev*10+remainder;
			num = num/10;
		}
			System.out.println("Revrse Number: "+rev);
		
	}
}
