package oct12;

public class Example1 {
   int oddRounder(int a)
   {
	   if(a==0)return -2;
	   else if(a%2==0)return a;
	   else if(a<=0)return -1;
	   else if(a%2!=0)return a=a+(10-a%10);
	   return a;
   }
   public static void main(String[] args)
   {
	   Example1 e1 = new Example1();
	   int x = e1.oddRounder(0);
	   System.out.println(x);
   }
}
