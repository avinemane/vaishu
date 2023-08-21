package Classe_Program;

public class Demo3 extends Thread {
	public void run()
	{
		System.out.println(getName());
		System.out.println(isDaemon());
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setDaemon(true);
		d.start();
		Thread t = Thread.currentThread();
		//t.yield();
		System.out.println(t.getName());
		System.out.println(t.isDaemon());
		
	}
}
