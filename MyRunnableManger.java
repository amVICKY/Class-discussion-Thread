package MultiThread;

class Shared
{
	public synchronized void set()
	{
		for(int i=0;i<500;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class MyThread1 extends Thread
{
	Shared s1 = null;
	public MyThread1(Shared s1)
	{
		this.s1 = s1;
	}
	public void run()
	{
		s1.set();
	}
}

class MyThread2 extends Thread
{
	Shared s2 = null;
	public MyThread2(Shared s2)
	{
		this.s2 = s2;
	}
	public void run()
	{
		s2.set();
	}
}

public class MyRunnableManger {
	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		MyThread1 t1 = new MyThread1(s1);
		MyThread2 t2 = new MyThread2(s1);
		t1.start();
		t2.start();
		
	}
}
