package demo;

class Nod{
	Nod pre;
	int data;
	Nod next;
	
	public Nod(Nod pre,int data, Nod next)
	{
		this.pre=pre;
		this.data=data;
		this.next=next;
	}
	
}
public class DoublyLink {
	Nod START;
	Nod LAST;
	public DoublyLink()
	{
		START=null;
	}
	public void add(int data)
	{
		Nod n=new Nod(null,data,null);
		if(START==null)
		{
			START=n;
			LAST=n;
			return;
		}
		
		LAST.next=n;
		n.pre=LAST;
		LAST=n;
	
	}
		public void traverse()
	    {
			Nod curr;
			for(curr=START;curr!=null;curr=curr.next)
			{
				System.out.println(curr.data);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		DoublyLink ref = new DoublyLink();
		ref.add(79);
		ref.add(89);
		ref.add(43);
		ref.add(65);
		ref.traverse();
	
 
}
}
