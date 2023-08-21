package Mansani_Sir_Program;

import java.sql.*;
import java.util.*;
public class PreparedStatement_EX2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
			PreparedStatement ps = con.prepareStatement
				("select * from studentDetails where rollno=?");
			 Scanner s = new Scanner(System.in);
				System.out.print("Enter a RollNo:");
				int rollno = s.nextInt();
				ps.setInt(1, rollno);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getInt(3));
			}
		}catch(Exception e)
		{
			e.printStackTrace();		}
	}
}
