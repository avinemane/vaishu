package Logic;

import java.util.Scanner;

public class UsingScannerClass_OddEvenNO2_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n[] = sc.nextInt();
		if(n>0) {
		  if(n%2==0) {
			System.out.println("Even Nuber");
		  }else {
			System.out.println("Odd Number");
		}
		}else {
		  if(n<0) {
			System.out.println("Negative Number");
		  }else {
			System.out.println("Zero");
		}
	 }
  }
}
