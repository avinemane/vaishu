package Logic;
//Print 1 to 100 no without using loop

public class Print_Num {
	public static void printNum(int num)
	{
		if(num<=100) {
			System.out.println(num+" ");
			printNum(num+1);
		}
	}
	public static void main(String[] args) {
		int n = 1;
		printNum(n);
	}
}
