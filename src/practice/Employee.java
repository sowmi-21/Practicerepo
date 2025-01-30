package practice;

class EmployeDemo
{
	String empname;
	int rank;
	public EmployeDemo(String empname, int rank)
	{
		this.empname=empname;
		this.rank=rank;
	}
	public String toString()
	{
		return "empname:"+empname+" "+"rank:"+rank;
	}
}
class Nodeemp
{
	EmployeDemo emp;
	Nodeemp left;
	Nodeemp right;
	public Nodeemp(EmployeDemo emp)
	{
		this.emp=emp;
		this.left=null;
		this.right=null;
	}
	
}



public class Employee {
	
	Nodeemp root;
	public Employee()
	{
		root=null;
	}
	
	public void addNode(EmployeDemo emp)
	{
		Nodeemp n = new Nodeemp(emp);
		if(root==null)
		  {
			  root=n;
			  return;
			  
		  }
		  if(emp.rank == 5) {
			  Nodeemp rt=root;
			  root=n;
			  insertnode(rt,root);
			  return;
		  }
		  insertnode(n,root);
	  }
	public void insertnode(Nodeemp n,Nodeemp current)
	{	  
			  //ion parent=null;
			  while(true)
			  {
				  //parent=current;
				  if(n.emp.rank<current.emp.rank)
				  {
					  if(current.left==null) {
					  current.left=n;
					  return;
					  }
					  current=current.left;
				  }
				  if(n.emp.rank>current.emp.rank)
				  {
					  if(current.right==null) {
						  current.right=n;
						  return;
						  }
						  current=current.right;
				  }
				  
			  }
		  
	  }
	  
	  public Nodeemp getRoot()
	  {
		  return root;
	  }
	  
	  public void inorder(Nodeemp n) {
		  if(n==null) {
			  return;
		  }
		  else {
			  inorder(n.left);
			  System.out.println(n.emp);
			  inorder(n.right);
		  }
	  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bst=new Employee();
		bst.addNode(new EmployeDemo("jessica",1));
		bst.addNode(new EmployeDemo("Cathy",2));
		bst.addNode(new EmployeDemo("Suzan",3));
		bst.addNode(new EmployeDemo("Christie",4));
		bst.addNode(new EmployeDemo("Sandra",5));
		bst.addNode(new EmployeDemo("Marry",6));
		bst.addNode(new EmployeDemo("Cassandra",7));
		bst.addNode(new EmployeDemo("Sneha",8));
		bst.addNode(new EmployeDemo("Viniz",9));
		bst.addNode(new EmployeDemo("Sharmila",10));
		bst.addNode(new EmployeDemo("Fenny",11));
		
		bst.inorder(bst.getRoot());
		
		Nodeemp rootnode=bst.getRoot();
		System.out.println("Root node: "+rootnode.emp);
	}

}
		
	
	


