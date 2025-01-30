package practice;

class Nodes
{
   int data;
   Nodes next;
   
   public Nodes(int data, Nodes next)
   {
	   this.data=data;
	   this.next=next;
   }
}

public class StackLL {
	
	Nodes top;
	
	public StackLL()
	{
		top=null;
	}
	public void push(int data)
	{
		Nodes n = new Nodes(data,null);
		n.next=top;
		top=n;


	}
	public int pop()
	{
		 int data=top.data;
		top=top.next;
		return data;
		
	}
	public void traverse()
	{
		Nodes cur;
		for(cur=top;cur!=null;cur=cur.next)
		{
			System.out.println(cur.data);
		}
	}
  public static void main(String[] args) {
	StackDemo s = new StackDemo();
	s.push(21);
	s.push(29);
	s.push(17);
	s.push(19);
	s.push(12);
	s.traverse();
	//s.pop();
	System.out.println(s.pop());
//	s.traverse();
	
}

}

