package demo;

class Nodes
{
	int data;
	Nodes left;
	Nodes right;
	public Nodes(int data)
	{
		this.data=data;
		
	}
	public Nodes(int data,Nodes left, Nodes right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public String toString()
	{
		return "data:"+data+" left:"+left+" right:"+right;
	}
}

public class BinarySearchTree {
	Nodes root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	public void addNode(int data)
	{
		if(root==null)
		{
			root=new Nodes(data);
			return;
		}
		
		Nodes current=root;
		Nodes parent=null;
		
		while(true)
		{
			parent=current;
			
			if(data<current.data)
			{
				current=current.left;
				
				if(current==null)
				{
					Nodes n=new Nodes(data);
					parent.left=n;
					return;
				}
			}

				if(data>current.data)
				{
					current=current.right;
					if(current==null)
					{
						Nodes n = new Nodes(data);
						parent.right=n;
						return;
					}
				}
			}
		}
		
	
	
	public Nodes getRoot()
	{
		return root;
	}
	
	public static void main(String[] args) {
		
		BinarySearchTree bs=new BinarySearchTree();
		bs.addNode(10);
		bs.addNode(7);
		bs.addNode(11);
		bs.addNode(6);
		bs.addNode(4);
		System.out.println("root-->"+bs.getRoot().data);
		System.out.println("left--->"+bs.getRoot().left.data);
		System.out.println("right------>"+bs.getRoot().right.data);
		System.out.println("left of left "+bs.getRoot().left.left.data);
		
	}

}
