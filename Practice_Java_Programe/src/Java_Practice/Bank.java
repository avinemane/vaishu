package Java_Practice;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter BankName ");
		String bankName = sc.nextLine();
		System.out.println(bankName);
		
		System.out.println("Enter ifscCode ");
		String ifscCode = sc.nextLine();
		System.out.println(ifscCode);
		
		System.out.println("Enter acHname ");
		String acHname = sc.nextLine();
		System.out.println(acHname);
		
		System.out.println("Enter acNo");
		int acNo = sc.nextInt();
		System.out.println(acNo);
  }
}
class BankDetails extends Bank{
	protected String bankName;
	protected String ifscCode;
	protected String acHname;
	protected int acNo;
	
	public void bank() {
		System.out.println(bankName);
		System.out.println(ifscCode);
		System.out.println(acHname);
		System.out.println(acNo);
  }
}
