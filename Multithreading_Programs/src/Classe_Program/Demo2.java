package Classe_Program;

public class Demo2 implements Runnable {
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println();
	}
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Child");
		Runnable r1  = new Demo2();
		Thread t1 = new Thread(tg,r1,"One");
		t1.start();
		
		Runnable r2 = new Demo2();
		Thread t2 = new Thread(tg,r2,"Two");
		t2.start();
		System.out.println(tg.activeCount());
		Thread.yield();
		Runnable r3 = new Demo2();
		Thread t3 = new Thread(r3,"Three");
		t3.start();
		
		Thread t = Thread.currentThread();
		System.out.println(Thread.activeCount());
		t.setName("Four");
		Thread.yield();
		System.out.println(t);
		tg.destroy();
		System.out.println(tg.activeCount());
		System.out.println(Thread.activeCount());
		Thread.yield();
	}
}
