package Lambda_Exprssion;

@FunctionalInterface
interface Test2{
	int add(int a,int b);
}
public class Demo3 {
	public static void main(String[] args) {
		Test2 t = (a,b)->a+b;
		int x = t.add(100, 50);
		System.out.println(x);
	}
}
