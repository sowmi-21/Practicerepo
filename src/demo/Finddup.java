package demo;

public class Finddup {
	public static void main(String[] args) {
		int arr[]= {12,11,14,13,14,16,19,12,22};
		
		for(int i=0; i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);
				
			}
			
		}
		
		
		
	}
}
