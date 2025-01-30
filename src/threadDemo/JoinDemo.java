package threadDemo;

public class JoinDemo extends Thread{
	public void run()
	{
		System.out.println("child thread");
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Thread th = Thread.currentThread();
		JoinDemo r = new JoinDemo();
		r.start();
		try
		{
			r.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(th.getName()+" execution ends");
	}

}
