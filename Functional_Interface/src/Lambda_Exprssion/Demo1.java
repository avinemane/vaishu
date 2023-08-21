package Lambda_Exprssion;

@FunctionalInterface
interface Test1{
	void add(int a,int b);
}
public class Demo1 {
	public static void main(String[] args) {
		
		
		Test1 t = new Test1()
		{
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
		};
		t.add(25,25);//both are same but different ways
		
		Test1 t1=(a,b)->System.out.println(a+b);
		t1.add(10,20);//this also above same
	}
}
