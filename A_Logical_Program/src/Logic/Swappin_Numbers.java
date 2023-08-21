
package Logic;

import java.util.Scanner;

public class Swappin_Numbers {
	public static void main(String[] args) {
	int a,b,c;
	System.out.println("Enter two numbers: ");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Before Swapping "+a+" "+b);
	c=a;
	a=b;
	b=c;
	System.out.println("After Swapping "+a+" "+b);
	}
}
