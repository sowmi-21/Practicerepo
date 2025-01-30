package practice;

class Clsys
{
	String ipAddress;
	String machineName;
	
  public Clsys(String ipAddress, String machineName)
  {
	  this.ipAddress=ipAddress;
	  this.machineName=machineName;
  }
  public String toString()
  {
	  return "Clsys ipAddress:"+ipAddress+" machineName:"+machineName;
  }
}

class Node
{
	Clsys clsys;
	Node next;
	Node prev;
	
	public Node(Clsys clsys, Node next, Node prev)
	{
		this.clsys=clsys;
		this.next=next;
		this.prev=prev;
	}
}

public class ClientSystem {
	Node START;
	Node LAST;
	
	public ClientSystem()
	{
		START=null;
		LAST=null;
	}
	
	public void add(String ipAddress, String machineName)
	{
	Node n = new Node(new Clsys(ipAddress,machineName),null,null);
	
	     if(START==null)
			{
		          START=n;
		          LAST=n;
		          return;
			}
	     LAST.next=n;
	     n.prev=LAST;
	     LAST=n;
	}
	
	public void traverse()
	{
		Node cur;
		for(cur=START; cur!=null; cur=cur.next)
		{
			System.out.println(cur.clsys);
		}
	}
	//System.out.println("reverse");
	public void reverse()
	{
		Node cur;
		for(cur=LAST; cur!=null; cur=cur.prev)
		{
			
			System.out.println(cur.clsys);
		}
	}
	
	public static void main(String[] args) {
		
		ClientSystem c = new ClientSystem();
		c.add("101","nila");
		c.add("102", "lucky");
		c.add("103", "dora");
		c.traverse();
		c.reverse();
	}

}
