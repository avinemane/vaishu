package test;

class Demo{
	
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.x=d1.x+5;
		d1.y=d1.y+5;
		System.out.println(d1.x);
		System.out.println(d1.y);
		System.out.println(d2.x);
		System.out.println(d2.x);
	}

}
