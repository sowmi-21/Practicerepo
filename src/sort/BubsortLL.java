package sort;
 class Nodesort {
	int data;
	Nodesort next;
	public Nodesort(int data, Nodesort next)
	{
		this.data=data;
		this.next=next;
	}
 }

public class BubsortLL {
Nodesort START;
	
	public BubsortLL()
	{
		START=null;
	}
	public void add(int data)
	{
		Nodesort n=new Nodesort(data,null);
		if(START==null)
		{
			n.next=START;
			START=n;
			return;
		}
		Nodesort curr;
		for(curr=START;curr.next!=null;curr=curr.next)
		{
			
		}
		curr.next=n;
	
	}
	public void addAtBeginning(int data)
	{
		Nodesort n=new Nodesort(data,null);
		n.next=START;
		START=n;
	}
	
	public void addAfter(int value, int data)
	{
		Nodesort n=new Nodesort(data,null);
		Nodesort curr;
		for(curr=START;curr.data!=value;curr=curr.next)
		{
			n.next=curr.next;
			curr.next=n;
		}
	}
	
	public void traverse()
	{
		Nodesort curr;
		for(curr=START;curr!=null;curr=curr.next)
		{
			System.out.println(curr.data);
		}
		
	}
	public void bubblesort()
	{
		if(START==null)
		{
			return;
		}
		boolean swap;
		do {
			swap=false;
			Nodesort curr = START;
		
		while(curr!=null && curr.next!=null)
		{
			if(curr.data>curr.next.data)
			{
				//swap data
				int temp = curr.data;
				curr.data=curr.next.data;
				curr.next.data=temp;
				swap=true;
			}
			 curr = curr.next;
		}
	}
	while(swap);
}
		




public static void main(String[] args) {
	BubsortLL l=new BubsortLL();
	l.add(12);
	l.add(29);
	l.add(21);
	l.add(15);
	l.add(16);
	l.addAtBeginning(17);//need to call before traverse method
	//l.addAfter(19, 07);
	//l.traverse();
	l.bubblesort();
	l.traverse();
}
}

