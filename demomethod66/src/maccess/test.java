package maccess;

class Example 
{
	static void m1(){
		System.out.println("m1 exe");
	}
	 void m2(){
		System.out.println("m2 exe");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		m1();
		Example e1=new Example();
		e1.m2();
		
	}
}
