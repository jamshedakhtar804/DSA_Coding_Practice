package msAccademyAssignment;

import java.util.Arrays;

public class SumOfFactors {

	public static void main(String[] args) {
		int[] arr= {2, 4};
		
		System.out.println(Arrays.toString(getSumFactorArray(arr)));
	}

	private static int[] getSumFactorArray(int[] arr) {
		int[] result=new int[arr.length];
		for(int i=0; i<arr.length; i++){
			result[i] = getSumFactor(arr[i]);
		}
		return result;
	}

	private static int getSumFactor(int number) {
		int sum=1 ; //Number is always divisible by 1
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i == 0) {
				sum += i;
				if(i != number/i) {
					sum += number/i;
				}
			}
		}
		if(number != 1) {
			sum += number;
		}
	
		return sum;
	}

}
