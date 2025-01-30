package practice;

class BulletNode
{
	Bullet bul;
	BulletNode next;
	public BulletNode(Bullet bul, BulletNode next)
	{
		this.bul=bul;
		this.next=next;
	}
	
}
class Bullet
{
	BulletNode bid;
	int damage;
	public Bullet(BulletNode bid, int damage)
	{
		this.bid=bid;
		this.damage=damage;
	}
	public String toString()
	{
		return "Fire Bullet "+bid+" (damage:"+damage+")";
	}
}



public class BulletQueue {
	
	BulletNode front;
	BulletNode rear;
	public BulletQueue()
	{
		front=rear=null;
	}
	
	public void loadBullet(BulletNode bid, int damage)
	{
		BulletNode b = new BulletNode(new Bullet(bid, damage),null);
		if(front==null && rear==null)
		{
			front=rear=b;
		}
		rear.next=b;
		rear=b;
		if(rear==null)
		{
			System.out.println("");
		}
		
	}
	
	public void fireBullet()
	{
		Bullet bul=front.bul;
		front=front.next;
		System.out.println(bul);
	}

}
