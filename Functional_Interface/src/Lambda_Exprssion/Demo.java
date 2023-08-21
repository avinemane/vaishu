package Lambda_Exprssion;

@FunctionalInterface
 interface Test {
	void show();
}
public class Demo {
	public static void main(String[] args) {
		Test t = ()->System.out.println("Welcome");
		t.show();
	}
}

