package Mansani_Sir_Program;

import java.sql.*;
import java.util.*;
public class Collable_Statement_Program {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
			   ("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
			CallableStatement cs = con.prepareCall("{call insertpro(?,?,?)}");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a RollNO: ");
			int rollno = s.nextInt();
			System.out.println("Enter Name: ");
			String name = s.next();
			System.out.println("Enter a Marks: ");
			int marks = s.nextInt();
			cs.setInt(1, rollno);
			cs.setString(2, name);
			cs.setInt(3, marks);
			cs.executeUpdate();
			System.out.println("One Record Inserted Successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
