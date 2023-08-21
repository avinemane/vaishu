package maccess;

public class Test1 {
	public static void main(String[] args) {
		int[] ia1=new int[5];
		
		ia1[0]=3;
		ia1[1]=4;
		ia1[2]=5;
		ia1[3]=6;
		ia1[4]=7;
		
		System.out.println("ia1.length:"+ia1.length);
		for(int i=0;i<ia1.length;i++) {
			System.out.println("ia1["+i+"]:"+ia1[i]);
		}
		//short.cut array var dec,array obj creation & ini in single line
		int[]ia2= {3,4,5,6,7};
		System.out.println("\nia2.length:"+ia2.length);
		for(int i=0;i<ia2.length;i++) {
			System.out.println("ia2["+1+"]:"+ia2[i]);
		}
	}

}
