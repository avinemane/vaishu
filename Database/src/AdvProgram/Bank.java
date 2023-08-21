package AdvProgram;
import java.sql.*;

import java.util.*;
import java.sql.*;

public class Bank {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"system","avinash");
			PreparedStatement ps1 = con.prepareStatement("select * from BankCustomer where AccNo=?");//Compilation only
			PreparedStatement ps2 = con.prepareStatement("update BankCustomer set balance=balance+? where AccNo=?");//Compilation only
			
			System.out.println("Commit Status:"+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("Commit Status:"+con.getAutoCommit());
			Savepoint sp = con.setSavepoint();
			System.out.println("Enter home AccNo:");
			long hAccNo = sc.nextLong();
			ps1.setLong(1,hAccNo);
			
			ResultSet rs1 = ps1.executeQuery();//Execution
			if(rs1.next()) {
				float bal = rs1.getFloat(4);
				System.out.println("Enter benificially AccNo:");
				long bAccNo = sc.nextLong();
				ps1.setLong(1,bAccNo);
				
				ResultSet rs2 = ps1.executeQuery();//Execution
				if(rs2.next()) {
					System.out.println("Enter the amt to be transefered:");
					float amt = sc.nextFloat();
					
					if(amt<=bal) {
						//statement-1
						ps2.setFloat(1,-amt);
						ps2.setLong(2, hAccNo);
						int p = ps2.executeUpdate();//Buffer Updated
						
						//statement-2
						ps2.setFloat(1,amt);
						ps2.setLong(2, bAccNo);
						int q = ps2.executeUpdate();//Buffer Updated
						
						if(p==1 && q==1) {
							con.commit();//Update database
							System.out.println("Transaction Successfull...");
						}else {
							System.out.println("Transaction failed...");
							con.rollback(sp);
						}
					}else {
						System.out.println("Insufficient fund...");
					}
				}else {
					System.out.println("Invalid bAccNo...");
				}
			}else {
				System.out.println("Invalid hAccNo...");
			}
		}catch(Exception e) {e.printStackTrace();}			
	}
}
