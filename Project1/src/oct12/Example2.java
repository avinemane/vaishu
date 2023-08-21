package oct12;

public class Example2 {
   int pnN(int a)
   {
	   if(a<0)return -1;
	   if(a>0)return 1;
	   else return 0;
   }
   public static void main(String[] args)
   {
	   Example2 e2 = new Example2();
	   int x=e2.pnN(-1);
	   System.out.println(x);
   }
}
