package AdvProgram;

import java.util.*;
import java.sql.*;
public class DbCon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the ProdCode:");
			String code = s.nextLine();
			System.out.println("Enter the ProdName:");
			String name = s.nextLine();
			System.out.println("Enter the ProdPrive:");
			float price = s.nextFloat();
			System.out.println("Enter the ProdQty:");
			int qty = s.nextInt();

			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl",
							"system","avinash");
			Statement stm = con.createStatement();
			int k = stm.executeUpdate("insert into Product50 values('"+code+"','"+name+"',"+price+","+qty+")");
			if(k>0) {
				System.out.println("Product details inserted Successfully");
			}
			con.close();
			s.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
