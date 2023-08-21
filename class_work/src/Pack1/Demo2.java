 package Pack1;

public class Demo2 {
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		int x = new Demo2().add(34,23);
		System.out.println(x);
		Demo2 d = new Demo2();
		int y = d.add(83,42);
		System.out.println(y);
	}
}
