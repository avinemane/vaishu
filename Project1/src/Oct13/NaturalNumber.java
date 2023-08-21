package Oct13;



public class NaturalNumber {
	String s = "";
   public String getNaturalNumber(int a,int b)
   {
	   
	   if(a<0 || b<0)
		   s+=-1;
	   else if(a==0 || b==0)
		   s+=-2;
	   else if(a<=b)
	   {
		   if(a!=b)
		   {
			  s+=a; 
		   }
		   else
		   {
			   s+=a;
		   }
		   if(a<b-1)
		   {
			   getNaturalNumber(++a,b);
			  
		   }
		   return s;
	   }
	return s;
   }
   class User
   {
	   public static void main(String[] args) {
		   NaturalNumber n = new NaturalNumber();
		   String result = n.getNaturalNumber(3,7);
		   System.out.println("range are: "+result);
	   }
   }
}
