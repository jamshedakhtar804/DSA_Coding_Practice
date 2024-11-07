package msAccademyAssignment;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String str="programming";
		
		System.out.println("Original String=> "+str);
		String result=removeDuplicateChar(str);
		System.out.println("String After Removal of Duplicates=> "+result);
	}

	private static String removeDuplicateChar(String str) {
		Set<Character> set=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		for(char c: str.toCharArray()) {
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
