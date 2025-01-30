package threadDemo;

public class ThreadActivity extends Thread{
	String[]player_names= {"peter","erric","sam","michael","andrew","william"};
//	player_names=this.getname();
	public void run()
	{
		for(int i=0; i<player_names.length;i++)
		{
//			try
//			{
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e)
//			{
//				System.out.println(e);
//			}
//			System.out.println("welcome to arena"+" "+player_names[i]);
//		}
		
		//player_names=this.getname();
		if(Thread.currentThread().getName().equals("player"))
		{
		System.out.println(player_names[i]);
		}
		else
		{
			System.out.println("Welcome");
		}
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
		}
		
	}
	public static void main(String[] args) {
		
		ThreadActivity p1 = new ThreadActivity();
		p1.setName("player");
		ThreadActivity p2 = new ThreadActivity();
		p2.setName("welcome");
		p1.start();
		p2.start();
		
	}

}
