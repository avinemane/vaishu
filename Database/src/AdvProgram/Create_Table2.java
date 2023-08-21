package AdvProgram;

import java.sql.*;
public class Create_Table2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","avinash");
			Statement stm = con.createStatement();
			stm.execute("create table student50(rollno number(3),name varchar2(10),marks number(3))");
			System.out.println("Table Created Successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
