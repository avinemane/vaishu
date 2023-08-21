package Mansani_Sir_Program;

import java.sql.*;
public class Select_01Row {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
			Statement stm = con.createStatement
				(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stm.executeQuery("select* from studentdetails");
			rs.absolute(3);
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getInt(3));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
