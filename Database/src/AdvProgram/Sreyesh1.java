package AdvProgram;
import java.util.*;
import java.sql.*;
public class Sreyesh1 {
	public static void main(String args[])throws Exception {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Location of the Department:");
		String addrs=in.next();
		addrs="'"+addrs+"'";
		String query="SELECT * FROM DEPT WHERE LOC="+addrs;
		//Class.forName("Oracle.jdbc.Driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(query);
	    boolean flag=false;
	    while(rs.next()!=false) {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2));
	    	flag=true;
	    }
	    if(flag==false)
	    	System.out.println("NO RECORDS FOUND");
	    rs.close();
	    st.close();
	    con.close();
	}
}
