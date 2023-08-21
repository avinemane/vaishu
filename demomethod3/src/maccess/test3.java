package maccess;
class Example3
{
	static int m1(){
		System.out.println("a is executed");
		return 10;
	}
	static {
        System.out.println("SB is executed");
	}

 	static void m2(){
		System.out.println("m2");
	}
	static int b=m3();
	static int m3(){
		System.out.println("b is executed");
		return 20;
	}
	static {
		System.out.println("sb2 is executed");
	}
		static int c=m4();
		static int m4 (){
			System.out.println("c is executed");
			return 30;
		}
		static
		{
			System.out.println("SB3 is executed");
		}

		public static void main(String[] args) 
		{
			System.out.println("main is executed");
		}
}

