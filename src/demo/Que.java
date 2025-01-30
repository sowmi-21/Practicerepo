package demo;

//import org.w3c.dom.Node;

class Nodee
{
	int data;
	Nodee next;
	
	public Nodee(int data, Nodee next)
	{
		this.data=data;
		this.next=next;
	}

}

public class Que {
	Nodee Front;
	Nodee Rear;
	
	public Que()
	{
		Front=Rear=null;
		
	}
	
	public void enqueue(int data)
	{
		Nodee n = new Nodee(data,null);
		if(Front==null && Rear==null)
		{
			
			Front=Rear=n;
			return;
		}
		Rear.next=n;
		Rear=n;
	}
	
	public void dequeue()
	{
		int data=Front.data;
		Front=Front.next;
		System.out.println(data);
	}
	
	public void traverse()
	{
		Nodee cur;
		for(cur=Front; cur!=null;cur=cur.next)
		{
			System.out.println(cur.data);
		}
	}
	
	public static void main(String[] args) {
		Que q = new Que();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		q.traverse();
		System.out.println("enqueue");
		q.dequeue();
		//q.traverse();
		
	}

}
