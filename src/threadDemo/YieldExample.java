package threadDemo;
class MThread extends Thread
{
	private String threadName;
	
	MThread(String name)
	{
		threadName = name;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(threadName+" - Count: "+ i);
			//Yielding control to allow other threads to execute
			Thread.yield();
		}
	}
}
public class YieldExample {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MThread thread1 = new MThread("Thread 1");
		MThread thread2 = new MThread("Thread 2");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		thread1.start();
		thread2.start();
		
		try {
			//wait for both threads to finish
			thread1.join();
			thread2.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Main thread finished.");
 
	}
}