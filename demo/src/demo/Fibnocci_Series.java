package demo;

import java.util.Scanner;

public class Fibnocci_Series {
   public static void main(String[] args) {
	   int term,a=0,b=1,c;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter any term: ");
	   int x = sc.nextInt();
	   term = x;
	   for(int i=1;i<=term;i++)
		{
			System.out.print(a+",");
			c=a+b;
			a=b;
			b=c;
		}
	   System.out.println(".");
	  
}
}
