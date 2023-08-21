package demo;

public class Demo1 {
	int[] get()
	{
		int[] a= {23,24,76,97,76};
		return a;
	}
	public static void main(String[] args) {
		int[] x = new Demo1().get();
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		Demo1 d = new Demo1();
		int[] y = d.get();
		for(int z:y)
		{
		System.out.println(z);
		}
	}
}
