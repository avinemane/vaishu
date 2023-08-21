package Logic;
import java.util.*;
public class ReverseNumber_ByUsin_StringBuffer {
	
	/* Online Java Compiler and Editor */
	     public static void main(String []args){
	        int n=123456;
	        String temp=""+n; //conversion of int to string
	        StringBuilder sb=new StringBuilder(temp); //creating stringbuilder obj
	        StringBuilder str=sb.reverse(); //using reverse method to reverse the obj
	        System.out.println(str.toString()); // printing reverse number
	     }
	}

