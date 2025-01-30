package practice;

//import demo.Nodee;
class Message
{
	String sendername;
	String desc;
	public Message(String sendername, String desc)
	{
		this.sendername=sendername;
		this.desc=desc;
	}
	@Override
	public String toString() {
		return "Message [sendername=" + sendername + ", desc=" + desc + "]";
	}
	
}

class NodeQ
{
	Message msg;
	NodeQ next;
	
	public NodeQ(Message msg, NodeQ next)
	{
		this.msg=msg;
		this.next=next;
		
	}
}


public class MsgQueue 
{
	NodeQ Front;
	NodeQ Rear;
	
	public MsgQueue()
	{
		Front=Rear=null;
	}

	public void acceptMessage(String sendername,String desc)
	{
		NodeQ n = new NodeQ(new Message(sendername, desc),null);
		if(Front==null && Rear==null)
		{
			Front=Rear=n;
			return;
		}
		Rear.next=n;
		Rear=n;
	}
	
	public void consumeMessage()
	{
		Message msg=Front.msg;
		Front=Front.next;
		System.out.println(msg);
	}
	public void traverse()
	{
		NodeQ cur;
		for(cur=Front; cur!=null;cur=cur.next)
		{
			System.out.println(cur.msg);
		}
	}
	
	public static void main(String[] args) {
		
		MsgQueue m = new MsgQueue();
		m.acceptMessage("sowmi","1");
		m.acceptMessage("priya", "2");
		m.acceptMessage("sankar", "3");
		m.traverse();
		m.consumeMessage();
		System.out.println("dequ");
		m.traverse();
	}
}

