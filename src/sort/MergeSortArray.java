package sort;

public class MergeSortArray {
	public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted
        }
        
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        // Fill left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
System.out.println("left");
        for(int x:left)
 { 
System.out.print(x+","); 
 }

System.out.println("right");
for(int x:right)
 { 
System.out.print(x+","); 
 }
        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);
        
        // Merge sorted halves
        merge(array, left, right);
    }
    
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Merge the left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        // Copy remaining elements of left, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        // Copy remaining elements of right, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
System.out.println("new array");
 for(int r:array)
 {
 System.out.print(r+","); 
 }
System.out.println();
    }
    
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(array);
        System.out.println("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}


