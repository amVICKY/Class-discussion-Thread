package MultiThread;

class Test1 extends Thread
{
	public void run()
	{
		for(int i=0;i<1000;i+=2)
		{
			System.out.println(getName()+":"+i);
		}
	}
}

public class Demo {
	public static void main(String[] args)
	{
		Test1 t1 = new Test1();
		t1.start();
		for(int i=1;i<1000;i+=2)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
