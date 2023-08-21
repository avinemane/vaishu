package Practice;

import java.util.*;

public class Even_Odd {

	public static void main(String[] args) {
		// call Testrev static method .
		Testrev tr = new Testrev();
		tr.Rev();

		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = x;
		if (a % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}

class Testrev {
	public void Rev() {
		String str = "india";
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
}
