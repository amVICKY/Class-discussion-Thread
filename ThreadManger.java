package MultiThread;

class MyFirst extends Thread
{
	@Override
	public void run() // Thread-0
	{
		for(int i=0;i<100;i+=2)
		{
			System.out.println(getName()+":"+i);
		}
	}
}

public class ThreadManger {
	public static void main(String[] args)
	{
		MyFirst mf = new MyFirst();
		mf.start();
		for(int i=1;i<100;i+=2)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
