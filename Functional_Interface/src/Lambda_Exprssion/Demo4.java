package Lambda_Exprssion;

@FunctionalInterface
interface Test4{
	int max(int a,int b);
}
public class Demo4 {
	public static void main(String[] args) {
		Test4 t = (a,b)->//this one &
		{
			if(a>b)
				return a;
			else 
				return b;
		};
		int x = t.max(40, 30);
		System.out.println(x);
		//same output 
		Test4 t1 = (a,b)->(a>b)?a:b;//this one
		int y = t1.max(20, 90);
		System.out.println(y);
	}
}
