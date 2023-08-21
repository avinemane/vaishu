package array;

public class Perfect_No_Or_Not {
	public static void main(String[] args) {
		int a = 28;
		int total=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
				total=total+i;
		}
		if(total==a)
			System.out.println("Given No is Perfect Number...");
		else
			System.out.println("Given No is Not Perfect Number...");
	}
}
