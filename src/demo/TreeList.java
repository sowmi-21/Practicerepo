package demo;

//import practice.BinaryTree;
//import practice.Node;

class Nodet
{
	int data;
	Nodet left;
	Nodet right;
	
	public Nodet(int data, Nodet left, Nodet right)
	{
		super();
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
public class TreeList {
	
	Nodet root;
	public TreeList()
	{
		root=null;
	}
	
public void addLeft(int data)
{ 
	Nodet n=new Nodet(data,null,null);
	if(root==null) 
	{ 
		root=n;
		return;
	}
	Nodet curr;
	for(curr=root;curr.left!=null;curr=curr.left)
	{ 
		
	}
	
	curr.left=n;
}
public void addRight(int data)
{ 
	Nodet n=new Nodet(data,null,null);
	if(root==null)
	{ 
		root=n;
		return;
	}
	Nodet curr;
	for(curr=root;curr.right!=null;curr=curr.right)
	{ 
	
	}
	
	curr.right=n;	 
}


public void traverse() 
{ 
	System.out.println("travesing left side");
	 for(Nodet curr=root;curr!=null;curr=curr.left)
	 { 
		 System.out.println(curr.data);
	 }
	 System.out.println("traversing right side");
	 for(Nodet curr=root;curr!=null;curr=curr.right)
	 {
		 System.out.println(curr.data);
	 }
	 
}
public void printLeft(Nodet n)
{ 
	System.out.println(n.left.data);
}
public void printRight(Nodet n)
{
	System.out.println(n.right.data);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

	TreeList obj=new TreeList();
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

