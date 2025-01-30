package sort;

public class MergeSort {
	public static void mergeSort(int [] array)
	{
		if(array.length<2)
		{
			return;
		}
		
		int mid = array.length/2;
		int[] left = new int[mid];
		int[] right = new int[array.length - mid];
		
		// fill left and right arrays
		for(int i=0;i<mid;i++){
			left[i] = array[i];
		}
		for(int i=mid;i<array.length;i++){
			right[i-mid]=array[i];
		}
//		System.out.println();
//		for(int x:left){
//			System.out.println(x+",");
//		}
//		for(int x:right){
//			System.out.println(x+",");
//		}
		//recursively sort both halves
		mergeSort(left);
		mergeSort(right);
		//merge sorted halves
		merge(array,left,right);
		
	}
	private static void merge(int[] array, int[]left, int[] right)
	{
		int i=0,j=0,k=0;
		//merge the left and right arrays
		while(i<left.length && j<right.length){
			if(left[i] <= right[j])	{
				array[k++] = left[i++];
			}
			else{
				array[k++] = right[j++];
			}
		}
		// copy remaining elements of left , if any
		while(i<left.length){
			array[k++] = left[i++];
		}
		// copy the remaining elements of right, if ANY
		while(j<right.length)
		{
			array[k++] = right[j++];
		}
//		System.out.println("new array");
//				for(int r:array){
//					System.out.println(r + ",");
//				}
//				System.out.println();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] array= {38,27,43,3,9,82,10};
				mergeSort(array);
				System.out.println("Sorted array: ");
				for (int num: array) {
				System.out.println (num + " ");
	}
 
}
}

