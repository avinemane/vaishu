package Oct15;

public class Example17 {
	String createboxpattern(int a, int b) {
		String str="";
		
		if(a<0) {
			 str="-1";
		}else if(a==0) {
			 str="-2";
		}else {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=b;j++) {
					if(i==1||j==1||i==a||j==b) {
						str=str+"*"+" ";
					}else {
						str=str+"  ";
					}
				}
				str=str+"\r";
			}
		
	    }
	        return str;

	    }
		
	}


    
    