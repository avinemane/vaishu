package AdvProgram;
import java.sql.*;
public class JDBC_Connection {
	public static void main(String[] args) 
	{
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");			
			System.out.println("Connection Established Successfully");
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
