package Pack1;

class Emp2 {
	int add(int a,int b)
	{
		System.out.println("Add");
		int c=a+b;
		return c;
	}
	void max(float a,float b)
	{
		System.out.println("Max");
		float c=a+b;
	}
	boolean get()
	{
		System.out.println("Boolean");
		return true;
	}
	void display() {
		System.out.println("Display");
		System.out.println();
	}
	static int cube(int a)
	{
		System.out.println("Cube");
		return a;
	}
	static void min(double a,double b)
	{
		System.out.println("Min");
		double c=a+b;
	}
	static long getValue()
	{
		System.out.println("GetValue");
		return 12212122;
	}
	static void show()
	{
		System.out.println("Show");
		System.out.println();
	}
	int[] sort(int[] a)
	{
		System.out.println("Short");
		return a;
	}
	void search(float[] a,float b)
	{
		System.out.println("Search");
	}
	int[] getElement()
	{
		System.out.println("getElement");
		return null;	
	}
	void print()
	{
		System.out.println("Print");
		System.out.println();
	}
	static boolean sort(double[] a)
	{
		System.out.println("SORT");
		return false; 
	}
	static void max(float[] a)
	{
		System.out.println("Max");
	}
	static double[] getValue1()
	{
		System.out.println("getValue1");
		return null;
	}
	static void displayValue()
	{
		System.out.println("displayValue");
		System.out.println();
	}
	int getValue3()
	{
		System.out.println("getValue3");
		return 3;
	}
	static boolean getBoolean()
	{
		System.out.println("getBoolean");
		return true;
	}
	char[] getChars()
	{
		System.out.println("getChars");
		return null ;
	}
	static void printValue()
	{
		System.out.println("printValue");
	}
	public static void main(String[] args) {
		Emp2 e = new Emp2();
		
		int x=e.add(3, 4);
		e.max(10.5f, 20.5f);
		e.get();
		e.display();
		
		Emp2.cube(5);
		Emp2.min(12.3, 2.2);
		Emp2.getValue();
		Emp2.show();
		
		int[] x1= {1};
		int[] a=e.sort(x1);
		
		float[] x2= {23.3f,33.2f,3.3f};
		e.search(x2, 52.24f);
		
		int[] x3=e.getElement();
		e.print();
		
		double[] x4= {23.,3.4,2.4};
		boolean b = Emp2.sort(x4);
		
		float[] x5= {2.4f,3.3f,3.1f};
		Emp2.max(x5);
		
		double[] x6=Emp2.getValue1();
		Emp2.displayValue();
		
		int x7=e.getValue3();
		boolean b1 = Emp2.getBoolean();
		char[] ch=e.getChars();
		Emp2.printValue();
		}
	}
	


	


	