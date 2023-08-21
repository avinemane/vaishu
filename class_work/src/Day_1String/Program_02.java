package Day_1String;

import java.util.*;
public class Program_02 {

		boolean b=false;
		boolean validateUserName(String s)
		{
			if(s.length()>=8 && s.endsWith("_job"))
				b=true;
			else
				b=false;
			return b;
		}
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String");
			String s = sc.next();
			Program_02 p = new Program_02();
			boolean b = p.validateUserName(s);
			System.out.println(b);
		}
	}


