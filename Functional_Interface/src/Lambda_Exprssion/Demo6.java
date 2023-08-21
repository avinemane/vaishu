package Lambda_Exprssion;

import java.util.function.*;
public class Demo6 {
	public static void main(String[] args) {
		Consumer<String> c = str->System.out.println(str);
		c.accept("Welcome");
		
		Supplier<String> su = ()->"hello";
		String st = su.get();
		System.out.println(st);
		
		UnaryOperator<String> uo = s->s.concat("Mahala");
		String s = uo.apply("Taj");
		System.out.println(s);
		
		BinaryOperator<Integer> bo = (a,b)->a+b;
		int x = bo.apply(10, 20);
		System.out.println(x);
		
		BiFunction<String,String,Boolean> bf = (s1,s2)->s1.equals(s2);
		boolean b = bf.apply("Hello", "Hello");
		System.out.println(b);
		
		
	}
}
