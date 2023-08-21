package Classe_Program;

public class Demo extends Thread {
	public void run()
	{
		System.out.println(this);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		Demo d1 = new Demo();
		d1.start();
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
