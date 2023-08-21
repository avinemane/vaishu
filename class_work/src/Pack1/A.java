package Pack1;

public class A {
	public void max(int a,int b)
	{
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	public static void main(String[] args) {
		A a = new A();
		a.max(23, 32);
	}
}
