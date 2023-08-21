package Oct18;

public class Ex21 {
	String checkPalindrome(int a)
	{
		String str="";
		int sum=0,b=a;
		if(a<0) {
			str="-1";
			
		}else if(a<1 && a>9) {
			str="-2";
		}
		else {
			while(b!=0) {
				int rem;
				rem=b%10;sum=sum*10+rem;
				b=b/10;
				
			}
			if(a==sum) {
				str="true";
			}
			else {
				str="false";
			}
		}
		return str;
	}
}
