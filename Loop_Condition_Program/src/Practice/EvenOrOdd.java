package Practice;

import java.util.*;
public class EvenOrOdd {
	
	public void evenOdd(int a)
	{
		if(a>0) {
			if(a%2==0) {
			System.out.println("Even");
			
		}else {
			System.out.println("odd");
		}
		}else {
			if(a<0) {
				System.out.println("Negative");
			}
			else {
				System.out.println("zero");
			}
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a one number: ");
		int a=sc.nextInt();
	
		EvenOrOdd e = new EvenOrOdd();
		e.evenOdd(a);
	}
}
