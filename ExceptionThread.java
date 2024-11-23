package MultiThread;

class One
{
	public void set(int value)
	{
		int i=value;
		System.out.println("Value of "+Thread.currentThread().getName()+":"+i);
	}
}

class Two
{
	int i;
	Two(int i)
	{
		this.i = i;
	}
	void callSet()
	{
		new One().set(i);
	}
}

class OneTwo extends Thread
{
	public void run()
	{
		Two t = new Two(10);
		t.callSet();
	}
}

class First
{
	public void set(int value)
	{
		int i = value/10;
		System.out.println("Value of "+Thread.)
	}
}

class Second
{
	int i;
	Second(int i)
	{
		this.i = i;
	}
	void callSet()
	{
		new 
	}
}

public class ExceptionThread {
	public static void main(String[] args)
	{
		System.out.println("Helllo");
	}
}
