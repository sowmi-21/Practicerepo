package demo;

class Nodebs {
    int data;
    Nodebs left;
    Nodebs right;

    public Nodebs(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
    }
}

public class BSTinOrder {
    Nodebs root;

    public BSTinOrder() {
        root = null;
    }
    public void addNodeWithoutRecursion(int data)
    { 
    	if(root==null) 
    	{ 
    		root= new Nodebs(data);
      return;	
    	}
    	Nodebs current=root;
    	Nodebs parent=null;
    	while(true) 
    	{ 
    		parent=current;
    		if(data<current.data)
    		{ 
    			current=current.left;
    			if(current==null) 
    			{ 
    				parent.left=new Nodebs(data);
    				return;
    			}
    		}else
    		{
    			if(data>current.data)
    			{ 
    				current=current.right;
    				if(current==null) 
    				{ 
    				  parent.right=new Nodebs(data);
    				  return;
    				}
    			}
    		}
    	}
    }

    public Nodebs addNode(Nodebs current, int data) {
        if (current == null) {
            return new Nodebs(data);
        }

        if (data < current.data) {
            current.left = addNode(current.left, data);
        } else if (data > current.data) {
            current.right = addNode(current.right, data);
        }
        return current; // return the unchanged node pointer
    }

    public void inOrderTraversal(Nodebs n) {
        if (n != null) {
            inOrderTraversal(n.left);
            System.out.println(n.data);
            inOrderTraversal(n.right);
        }
    }

    public static void main(String[] args) {
    	BSTinOrder bs = new BSTinOrder();
//        bs.root = bs.addNode(bs.root, 10);
//        bs.addNode(bs.root, 15);
//        bs.addNode(bs.root, 23);
//        bs.addNode(bs.root, 11);
//        bs.addNode(bs.root, 16);
        bs.addNodeWithoutRecursion(10);
        bs.addNodeWithoutRecursion(12);
        bs.addNodeWithoutRecursion(23);
        bs.addNodeWithoutRecursion(16);
        bs.addNodeWithoutRecursion(15);
        System.out.println("In-Order Traversal:");
        bs.inOrderTraversal(bs.root);
    }
}

