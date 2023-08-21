package Oct15;
import java.util.*;
public class User {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Example17 e1 = new Example17();
		String c = e1.createboxpattern(a,b);
		System.out.println(c);
	}
}
