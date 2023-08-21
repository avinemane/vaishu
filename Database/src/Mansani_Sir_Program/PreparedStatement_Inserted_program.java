package Mansani_Sir_Program;

import java.sql.*;
import java.util.*;
public class PreparedStatement_Inserted_program {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
			PreparedStatement ps = con.prepareStatement("insert into studentdetails values(?,?,?)");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a RollNo: ");
			int rollno = s.nextInt();
			System.out.println("Enter a Name: ");
			String name = s.next();
			System.out.println("Enter a Marks: ");
			int marks = s.nextInt();
			ps.setInt(1, rollno);
			ps.setString(2, name);
			ps.setInt(3, marks);
			ps.executeUpdate();
			System.out.println("Record Inserted Successfully...");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
