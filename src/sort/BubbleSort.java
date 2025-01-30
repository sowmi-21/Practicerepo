
package sort;

public class BubbleSort {
	public void run()
	{
		
	}
	public static void main(String[] args) {
		//int n=5;
		int arr[]= {2,21,8,9,12,5,29};
		
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]);
			}
			
	}

}
