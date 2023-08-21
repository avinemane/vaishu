package AdvProgram;

//import java.beans.Statement;
import java.sql.*;

public class Dbcon1 {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system","avinash");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from customer50");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getLong(5));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
