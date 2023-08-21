package maccess;

public class Factor {
	void factorNum(int a) {
		
        //int total=0;
        for(int i=1;i<a;i++)
        {
        	if(a%i==0)
        		//total=total+i;
        		System.out.println(i);
        }
       // System.out.println(total);   sum of factors  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
		Factor f = new Factor();
		f.factorNum(a);
       
       
	}
}