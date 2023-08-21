package Practice;

import java.util.*;
public class IF_Else_If_Con {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
	
		int a=x;
		if(a>0) {
			if(a%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
		}
		else {
			if(a<0) {
				System.out.println("Negative number");
			}
			else {
				System.out.println("Zero");
			}
		}
	}
}
