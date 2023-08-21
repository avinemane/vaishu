package Mansani_Sir_Program;

import java.sql.*;
public class Inserted_Records {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
			Statement stm = con.createStatement();
			stm.executeUpdate("insert into studentdetails values(1,'Avi',99)");
			System.out.println("One Record Inserted Successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
