package MultiThread;

class Test extends Thread
{
	public void run()
	{
		for(int i=1;i<1000;i+=2)
		{
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setName("odd");
			System.out.println(getName()+":"+i);
		}
		
		
	}
}

class Sample extends Thread
{
	public void run()
	{
		
		for(int i=0;i<1000;i+=2)
		{
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			setName("even");
			System.out.println(getName()+":"+i);
		}
	}
}

public class Manager
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		Test t1 = new Test();
		Sample s1 = new Sample();
		s1.start();
	}
}
