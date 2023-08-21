package Oct17;

public class Ex19 {
	String NumberPattern(int a) {
		String str="";
		if(a<0) {
			 str="-1";
		}else if(a==0) {
			 str="-2";
		}else {
			for(int i=1;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					int k=j;
					k=i*j;
					str=str+k+" ";
				}
				str=str+"\r";
			}
		
	    }
	        return str;

	}
}


