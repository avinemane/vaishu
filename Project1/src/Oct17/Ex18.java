package Oct17;

public class Ex18 {
	String createStarPattern(int a) {
	    String str="";
		
		if(a<0) {
			 str="-1";
		}else if(a==0) {
			 str="-2";
		}else {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					str=str+"* ";
				}
				str=str+"\r";
			}
		
	    }
	        return str;

	    }
	}




