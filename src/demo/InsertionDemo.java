package demo;

 class Node1 {
	String data;
	Node1 next;
	public Node1(String data, Node1 next)
	{
		this.data=data;
		this.next=next;
	}

}

public class InsertionDemo {
	Node1 START;
	public void linkedList()
	{
		START=null;
	}
	public void add(String data)
	{
		Node1 n=new Node1(data,null);
		if(START==null)
		{
			n.next=START;
			START=n;
			return;
		}
		
		Node1 curr;
		for(curr=START;curr.next!=null;curr=curr.next)
		{
			
		}
		curr.next=n;
	
	}
	
	public void addAtBeginning(String data)
	{
		Node1 n=new Node1(data,null);
		n.next=START;
		START=n;
	}
	
	public void addAfter(String value, String data)
	{
		Node1 n=new Node1(data,null);
		Node1 curr;
		for(curr=START;curr.data!=value;curr=curr.next)
		{
			n.next=curr.next;
			curr.next=n;
		}
	}
	
	public void traverse()
	{
		Node1 curr;
		for(curr=START;curr!=null;curr=curr.next)
		{
			System.out.println(curr.data);
		}
		
	}
	public static void main(String[] args) {
		InsertionDemo i = new InsertionDemo();
		i.add("Eric");
		i.add("sowmi");
		i.add("nila");
		i.add("lucky");
		i.add("dora");
		i.add("aslaan");
		i.addAtBeginning("sv");
		i.traverse();
	}
	
	}

