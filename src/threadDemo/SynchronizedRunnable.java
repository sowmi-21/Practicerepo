package threadDemo;

public class SynchronizedRunnable implements Runnable {

	@Override
	public synchronized void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
		}
	}
	public static void main(String[] args) {
		SynchronizedRunnable runnable = new SynchronizedRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		t1.start();
		t2.start();
	}
		
	}
	


