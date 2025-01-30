package threadDemo;

public class MyRunnable implements Runnable{

	@Override
	
//	public void run() {
//		System.out.println("Thread with runnable instance started");
//	}
	public void run() {
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
			
	}
	public static void main(String[] args) {
		Thread th = new Thread(new MyRunnable());
		Thread th1 = new Thread(new MyRunnable());
		
		th.start();
		th1.start();
	}
	

}
