package msAccademyAssignment.dailyAssignment;

public class sumEqualsLeftAndRight {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6};
		
		int sum=0;
		int leftSum=0;
		int rightSum=sum;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			
			rightSum -= arr[i];
			
			if(leftSum == rightSum) {
				System.out.println(i +"\t" +arr[i]);
				break;
			}
			leftSum += arr[i];
		}
	}

}
