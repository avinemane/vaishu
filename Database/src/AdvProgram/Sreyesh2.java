package AdvProgram;
import java.util.*;
import java.sql.*;
public class Sreyesh2 {

	public static void main(String[] args)throws Exception {
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter Startiing Range:");
	    int start=in.nextInt();
	    System.out.println("Enter Ending Range");
	    int end=in.nextInt();
	    String query="SELECT * FROM EMP WHERE SAL BETWEEN 4000 & 8000";
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","avinash");
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(query);
	    boolean flag=false;
	    while(rs.next()!=false) {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
	    	flag=true;
	    }
	    if(flag==false)
	    	System.out.println("NO RECORDS FOUND");
	    rs.close();
	    st.close();
	    con.close();
	    
	    }
	}

