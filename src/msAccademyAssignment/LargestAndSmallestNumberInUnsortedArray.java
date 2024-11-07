package msAccademyAssignment;

public class LargestAndSmallestNumberInUnsortedArray {

	public static void main(String[] args) {
		int []arr= {3,4,5,3,6,5,10};
		
		findSmallestAndLargestNumber(arr);
	}

	private static void findSmallestAndLargestNumber(int[] arr) {
		int smallest=Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;
		
		for(int num : arr) {
			smallest=Math.min(smallest, num);
			largest=Math.max(largest, num);
		}
		
		System.out.println("Largest Number is=> "+largest);
		System.out.println("Smallest Number is=> "+smallest);
	}

}
