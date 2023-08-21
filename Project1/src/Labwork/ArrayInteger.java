package Labwork;

import java.util.*;
public class ArrayInteger {
	int a[]= {3,5,3,46,5,43};
	private int b;
	public ArrayInteger(int b) {
		this.b=b;
	}
	boolean IsAvailable() {
		boolean s=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b) {
				s=true;
				break;
			}
			else
				s=false;
		}
		return s;
		
	}
	
	java.lang.String name() {
		java.lang.String k="";
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b) {
				k=a[i]+" index is "+i;
				break;
			}
		}
		return k;
		
		
		
	}
	public static void main (String[] args) {
		ArrayInteger a = new ArrayInteger(99);
		System.out.println(a.IsAvailable());
		System.out.println(a.name());
	}
}
