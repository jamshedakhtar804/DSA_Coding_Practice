package msAccademyAssignment;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
		String str="abcabcbb";
		
		//create a hashset and and add the elements in the set if it is not present otherwise remove the added in the starting
		int maxLength=0;
		int left=0;
		Set<Character> set=new HashSet<>();
		for(int right=0; right<str.length(); right++){
			while(set.contains(str.charAt(right))) {
				set.remove(str.charAt(left));
				left++;
			}
			set.add(str.charAt(right));
			
			maxLength=Math.max(maxLength, right-left+1);
		}
		
		System.out.println("Length of longest substring without repeating characters"+maxLength);
	}

}
