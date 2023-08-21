package maccess;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter fno: ");
		int fno=scn.nextInt();
		
		System.out.println("Enter sno: ");
		int sno=scn.nextInt();
		
		int res=fno+sno;
		System.out.println("Result: "+res);
	}	
}
	    

	


