package msAccademyAssignment;

public class MissingNumberInGivenArray {

	public static void main(String[] args) {
		// Example array from 1 to 100 with one number missing
        int[] array = new int[99];
        int missingNumber = 55; // Example missing number

        // Filling the array without the missing number
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missingNumber) {
                array[index++] = i;
            }
        }

        // Find the missing number
        int result = findMissingNumber(array, 100);
        System.out.println("The missing number is: " + result);
	}

	private static int findMissingNumber(int[] array, int n) {
		int actualSum=n*(n+1)/2;
		
		int calculatedSum=0;
		for(int num: array) {
			calculatedSum +=num;
		}
		return actualSum-calculatedSum;
	}

}
