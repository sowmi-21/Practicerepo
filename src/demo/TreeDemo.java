package demo;

public class TreeDemo {
	int arr[];
	
	TreeDemo(int arr[])
	{
		this.arr=arr;
	}
	public int getLeftIndex(int pos)
	{
		return arr[2*pos+1];
	}
	public int getRightIndex(int pos)
	{
		return arr[2*pos+1];
	}
	
	public static void main(String[] args) {
		int arr[]= {4,5,6,3,7,2,1,11,16,19,22};
		TreeDemo t = new TreeDemo(arr);
		System.out.println(t.getLeftIndex(0));
		System.out.println(t.getRightIndex(0));
		System.out.println(t.getLeftIndex(1));
		System.out.println(t.getRightIndex(1));
		System.out.println(t.getLeftIndex(2));
		System.out.println(t.getRightIndex(2));
		System.out.println(t.getLeftIndex(3));
		System.out.println(t.getRightIndex(3));
		System.out.println(t.getLeftIndex(4));
		System.out.println(t.getRightIndex(4));
		System.out.println(t.getLeftIndex(5));
		System.out.println(t.getRightIndex(5));
		
		
		
		
	}

}

