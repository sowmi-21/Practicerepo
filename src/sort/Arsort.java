package sort;

//class find{
//	public void min()
//	{
//		
//	}
//}

public class Arsort {
	public static void main(String[] args) {
		int arr[]= {12,23,11,19,55,27,32,16};
		int i,j;
		for( i=0; i<arr.length; i++)
		{
			int temp=0;
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println(arr[i]+" ");
		}
		System.out.println("The smallest no is:"+arr[0] );
		System.out.println("The largest no is:"+arr[arr.length-1] );
		
	}

}
