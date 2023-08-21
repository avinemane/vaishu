package Lambda_Exprssion;

@FunctionalInterface
interface Test5{
	int cube(int a);
}
public class Demo5 {
	public static void main(String[] args) {
		Test5 t = a->a*a*a;
		int x = t.cube(5);
		System.out.println(x);
	}
}
