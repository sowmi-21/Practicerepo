package demo;


public class LinkIst {
	Node START;
	
	public LinkIst()
	{
		START=null;
	}
	public void add(int data)
	{
		Node n=new Node(data,null);
		if(START==null)
		{
			n.next=START;
			START=n;
			return;
		}
		Node curr;
		for(curr=START;curr.next!=null;curr=curr.next)
		{
			
		}
		curr.next=n;
	
	}
	public void addAtBeginning(int data)
	{
		Node n=new Node(data,null);
		n.next=START;
		START=n;
	}
	
	public void addAfter(int value, int data)
	{
		Node n=new Node(data,null);
		Node curr;
		for(curr=START;curr.data!=value;curr=curr.next)
		{
			n.next=curr.next;
			curr.next=n;
		}
	}
	
	public void traverse()
	{
		Node curr;
		for(curr=START;curr!=null;curr=curr.next)
		{
			System.out.println(curr.data);
		}
		
	}
	
	
	public static void main(String[] args) {
		LinkIst l=new LinkIst();
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.addAtBeginning(21);//need to call before traverse method
		//l.addAfter(19, 07);
		l.traverse();
		
		

		
		
	}

}
