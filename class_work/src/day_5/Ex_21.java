package day_5;

import java.util.*;
public class Ex_21 {
	int maxBlock(String s)
	{
		int max = 0;
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])c++;
				else
					break;
		    }
		    if(c>max)max=c;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		Ex_21 e = new Ex_21();
		System.out.println(e.maxBlock(s));
		sc.close();
	}
}
