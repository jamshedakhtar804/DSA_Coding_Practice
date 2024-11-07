package msAccademyAssignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInGivenArray {

	public static void main(String[] args) {
		int []arr= {3,4,5,3,6,5,10};
		
		int res=findDuplicates(arr);
		System.out.println("Duplicate number is=> "+res);
		printDuplicates(arr);

	}

	private static int findDuplicates(int[] arr) {  //o(nlogn)  single duplicates
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}
	
	private static void printDuplicates(int[] arr) {  //multiples duplicates o(n)
		Set<Integer> set=new HashSet<>();
		for(int num : arr) {
			if(!set.add(num)) {
				System.out.println(num+"\t");
			}
		}
	}
	

}
