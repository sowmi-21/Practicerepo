package practice;

public class StackDemo {
	int n=10;
	int arr[] = new int[n];
	int top=-1;
	int data;
	
	public int push(int data)
	{
		
		top++;
		arr[top]=data;
		return arr[top];
	}
	public int pop()
	{
		data=arr[top];
		top--;
		return data;
	}
	public void traverse()
	{
		for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
  public static void main(String[] args) {
	StackDemo s = new StackDemo();
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.traverse();
	//s.pop();
	System.out.println(s.pop());
//	s.traverse();
	
}

}
