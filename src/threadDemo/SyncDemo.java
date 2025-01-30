package threadDemo;

public class SyncDemo implements Runnable {
	public synchronized void run() {
		// code does not come under synchronized block will be executed by both
		//threads immediately
		System.out.println(Thread.currentThread().getName());
		synchronized(this)
		{
			for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
	public static void main(String[] args) {
		SyncDemo runnable = new SyncDemo();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
	}

}
