package msAccademyAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllTargetSumPair {

	public static void main(String[] args) {
		int []arr= {3,4,1,5,6,7};
		int target=11;
		
		System.out.println("All Pairs");
		findAllPairs(arr,target);
		
		System.out.println("All Combinations");
		findAllCombinations(arr, target);

	}

	private static void findAllCombinations(int[] arr, int target) {
		List<Integer> combination=new ArrayList<>();
		helper(arr,target,0,combination);
	}

	private static void helper(int[] arr, int target, int startIndex, List<Integer> combination) {
		if(target==0) {
			System.out.println(combination);
			return;
		}
		
		for(int i=startIndex; i< arr.length; i++) {
			if(arr[i] <= target) {
				combination.add(arr[i]);
				helper(arr,target-arr[i],i+1,combination);
				combination.remove(combination.size()-1);
			}
		}
	}

	private static void findAllPairs(int[] arr, int target) {
		Map<Integer, Integer> map=new HashMap<>();
		for(int num : arr) {
			int complement=target - num;
			if(map.containsKey(complement)) {
				System.out.println("Pair Found=> ["+complement+","+num+"]");
			}
			map.put(num, 1);
		}
	}
	

}
