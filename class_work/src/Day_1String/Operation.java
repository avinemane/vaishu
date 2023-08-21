package Day_1String;

import java.util.*;
public class Operation {
	String changeString(String a,char c)
	{
		char[]ch = a.toCharArray();
		String st="";
		
		switch(c)
		{
		case'a':
			st = a+a;
			break;
		case'b':
			for(int i=0;i<a.length();i++)
			{
				if(i%2==0)st+='*';
				else st+=ch[i];		
			}
			break;
		case 'c':
			for(int i=0;i<a.length();i++)
			{
				for(int j=1;j<a.length();j++)
				{
					if(ch[i]==ch[j])ch[j]='*';
				}
			}
//55623091864
				for(int k=0;k<a.length();k++)
				
					if(ch[k]!='*')st+=ch[k];
					break;
					case'd':
						for(int i=0;i<a.length();i++)
						{
							if(i%2==0 && ch[i]>97 && ch[i]<=122)
								st+=(char)(ch[i]-32);
							else 
								st+=ch[i];
						}
					}
				
			return st;
	
	}
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = sc.next();
		System.out.println("Enter Choice: ");
		char c = sc.next().charAt(0);
		Operation op = new Operation();
		System.out.println(op.changeString(a, c));
	}
}
