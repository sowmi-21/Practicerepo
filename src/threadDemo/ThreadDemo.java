package threadDemo;

public class ThreadDemo extends Thread{
	
	public void run()
	{
		String name =this.getName();
		System.out.println("thread started"+name);
	}
	
	public static void main(String[] args) {
		ThreadDemo th1 = new ThreadDemo();
		th1.setName("first thread");
		ThreadDemo th2 = new ThreadDemo();
		th2.setName("Second Thread");
		th1.start();
		th2.start();
	}
}
