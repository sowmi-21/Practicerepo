package threadDemo;

public class NumberRunner extends Thread{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		NumberRunner t1 = new NumberRunner();
		t1.start();
	}

}
