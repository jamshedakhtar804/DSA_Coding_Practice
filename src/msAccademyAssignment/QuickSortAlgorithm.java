package msAccademyAssignment;

import java.util.Arrays;

//Take a pivot value and divide the array on the basis of same and call the function recursively
public class QuickSortAlgorithm {

	public static void main(String[] args) {
		int[] arr= {5,2,6,3,1,4};
		System.out.println("Before Sorting=> "+Arrays.toString(arr));
		quickSort(arr,0, arr.length-1);
		
		System.out.println("After Sorting=> "+Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low < high) {
			int pi=partition(arr,low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr,pi+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot=arr[high]; //take pivot as the last value and find out its correct position and from there divide the array in two parts excluding pivot value
		int i=low-1;
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				//swap the i and j index value
				int temp=arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		//swap pivot value to its correct index
		int temp=arr[high];
		arr[high]=arr[i+1];
		arr[i+1]=temp;
		
		return i+1;
	}

}
