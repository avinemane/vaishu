package Labwork;

public class Storeline {
	int[] a= {2,5,54,59,4,45};
	
	
	void delete(int b) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b)
				System.out.println(" "+a[i]);
		}
	}
	public static void main(String[] args) {
		Storeline s = new Storeline();
		s.delete(45);
	}
}
