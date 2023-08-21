package Classe_Program;

public class Demo1 implements Runnable{
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("child");
		Runnable r1 = new Demo1();
		Thread t1 = new Thread(tg,r1,"one");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		Runnable r2 = new Demo1();
		Thread t2=new Thread(tg,r2,"Two");
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
		Runnable r3 = new Demo1();
		Thread t3 = new Thread(r3,"Three");
		t3.setPriority(8);
		t3.start();
		
		Thread t = Thread.currentThread();
		t.setName("Four");
		System.out.println(t);
	}
}
