package Mansani_Sir_Program;

import java.sql.*;
public class Insert_Record {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stm.executeQuery("select rollno,name,marks from studentdetails");
			rs.absolute(1);
			rs.updateInt(3, 500);
			rs.updateRow();
			System.out.println("One Record Inserted Successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
