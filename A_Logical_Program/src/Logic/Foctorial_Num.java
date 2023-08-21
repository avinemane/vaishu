package Logic;

import java.util.Scanner;

public class Foctorial_Num {
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			//fact=n;
			fact = fact*i;
		}
		System.out.println("Factorial"+" "+ fact);
	}
}
