package demo;
class Nood
{
	int data;
	Nood left;
	Nood right;
	public Nood(int data, Nood left, Nood right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}
	
	
public class BinaryTree {

	Nood root;
	public BinaryTree()
	{ 
		root=null;
	}
	public void addLeft(int data)
	{ 
		Nood n=new Nood(data,null,null);
		if(root==null) 
		{ 
			root=n;
			return;
		}
		Nood curr;
		for(curr=root;curr.left!=null;curr=curr.left)
		{ 
			
		}
		
		curr.left=n;
	}
	public void addRight(int data)
	{ 
		Nood n=new Nood(data,null,null);
		if(root==null)
		{ 
			root=n;
			return;
		}
		Nood curr;
		for(curr=root;curr.right!=null;curr=curr.right)
		{ 
		
		}
		
		curr.right=n;	 
	}
	

	public void traverse() 
	{ 
		System.out.println("travesing left side");
		Nood curr;
		 for( curr=root;curr!=null;curr=curr.left)
		 { 
			 System.out.println(curr.data);
		 }
		 System.out.println("traversing right side");
		 for( curr=root;curr!=null;curr=curr.right)
		 {
			 System.out.println(curr.data);
		 }
		 
	}
	public void printLeft(Nood n)
	{ 
		System.out.println(n.left.data);
	}
	public void printRight(Nood n)
	{
		System.out.println(n.right.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree obj=new BinaryTree();
		obj.addLeft(12);
	    obj.addLeft(23);
	    obj.addRight(11);
	    obj.addLeft(16);
	    obj.addRight(19);
	    obj.addLeft(15);
	    obj.addRight(25);
	    
	    System.out.println(obj.root.data);
	    System.out.println(obj.root.left.data);
	    System.out.println(obj.root.right.data);
	    
	    
	    
	    
		
	}

}


