package AdvProgram;

import java.util.*;
import java.sql.*;
public class DbCon3 {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee Id: ");
		String EmpId = sc.nextLine();
		System.out.println("Employee Name: ");
		String EName = sc.nextLine();
		System.out.println("Employee Salary: ");
		float Salary = sc.nextFloat();
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
				"system","avinash");
		Statement stm = con.createStatement();
		int k = stm.executeUpdate("insert into Employee values('"+EmpId+"','"+EName+"',"+Salary+")");
		if(k>0) {
			System.out.println("Employee details inserted successfully: ");
		}
		con.close();
		sc.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
