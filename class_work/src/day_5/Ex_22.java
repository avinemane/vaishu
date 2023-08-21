package day_5;

import java.util.Scanner;

public class Ex_22 {
	int countTriple(String s)
	{
		int count = 0;
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])c++;
				else break;
			}
			if(c==3)count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		Ex_22 e = new Ex_22();
		System.out.println(e.countTriple(s));
		sc.close();
	}
}
