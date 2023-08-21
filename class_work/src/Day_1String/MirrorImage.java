package Day_1String;

import java.util.*;
public class MirrorImage {
	String getImage(String a)
	{
		String b="";
		for(int i=a.length()-1;i>0;i--)
		{
			b+=a.charAt(i);
		}
		return a+"|"+b;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String:");
		String a = sc.next();
		MirrorImage mi = new MirrorImage();
		System.out.print(mi.getImage(a));
	}
}
