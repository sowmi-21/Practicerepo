package threadDemo;

public class MyThread extends Thread {
	
	public void run()
	{
		System.out.println("thread started"); 
	}
	public static void main(String[] args) {
		MyThread th = new MyThread();
		MyThread th1 = new MyThread();
		th.start();
		th1.start();
	}

}
