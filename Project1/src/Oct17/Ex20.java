package Oct17;

public class Ex20 {
	String str="";
	String checkPrime(int a) {
		if(a<0) {
			 str="-1";
		}else if(a==0||a==1) {
			 str="-2";
		}else {
			int count=0;
			for(int i=1;i<a;i++) {
				if(a%i==0) {
					count++;
				}	
			}
			if(count>=2) 
				str="false";
			else
				str="true";
		}
		
		return str;
		
	}
}


