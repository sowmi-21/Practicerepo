package practice;

class Bug
{
	int bugno;
	String desc;
	
	public Bug(int bugno, String desc)
	{
		this.bugno=bugno;
		this.desc=desc;
	}
	public String toString()
	{
		return "bugno:"+bugno+" desc:"+desc;
	}


}

class Nodeb
{
	Bug bug;
	Nodeb next;
	
	public Nodeb(Bug bug,Nodeb next)
	{
		this.bug=bug;
		this.next=next;
	}
}

public class BugTrackingSystem {
	
	Nodeb top;
	public BugTrackingSystem()
	{
		top=null;
	}
	
	public void push(int bugno, String desc)
	{
		Nodeb n = new Nodeb(new Bug(bugno, desc), null);
		n.next=top;
		top=n;
	}
	
	public Bug pop()
	{
		Bug bug=top.bug;
		top=top.next;
		//System.out.println(bug);
		return bug;
	}
	
	public void display()
	{
		Nodeb cur;
		for(cur=top; cur!=null; cur=cur.next)
		{
			System.out.println(cur.bug);
		}
	}
	public static void main(String[] args) {
		
		BugTrackingSystem b = new BugTrackingSystem();
		b.push(1, "virus");
		b.push(2, "malware");
		b.push(3, "ransomware");
		b.push(4, "phising");
		b.display();
		System.out.print(b.pop());
		
	}
	
	

}
