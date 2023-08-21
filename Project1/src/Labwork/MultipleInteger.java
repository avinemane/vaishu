package Labwork;
import java.util.*;
public class MultipleInteger {
	public static void main(String[] args) {
		int first,second,add,sub,mul;
		float div;
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter tWo number: ");
		first=sc.nextInt();
		second=sc.nextInt();
		
		add=first+second;
		sub=first-second;
		mul=first*second;
		div=(float)first/second;
		System.out.println("sum="+add);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
		System.out.println("div="+div);
	}
}
