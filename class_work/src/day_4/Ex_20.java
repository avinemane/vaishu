package day_4;

import java.util.*;
public class Ex_20 {
	
	void  findAnagrams(String s)
	{
		String s1[] =s.split("[ ,]");
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				String f="{";
				if(s1[i].length()!=s1[j].length())
					continue;
				else
				{
					int c=0;
					char ch[] = s1[i].toCharArray();
					char ch1[]= s1[j].toCharArray();
					for(int m=0;m<ch.length;m++)
					{
						for(int k=0;k<ch.length;k++)
						{
							if(ch[m]==ch1[k])
							{
								c++;
								ch[k]=' ';
								break;
							}
						}
						if(c==ch.length)
							f=f+s1[i] +" "+ s1[j];
					}
					if(c==ch.length)
						System.out.println(f+"}");
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		
		Ex_20 e = new Ex_20();
		System.out.println();
		e.findAnagrams(s);
		sc.close();
	}
}
