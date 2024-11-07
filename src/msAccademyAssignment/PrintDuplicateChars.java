package msAccademyAssignment;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateChars {

	public static void main(String[] args) {
		String str="programming";
		
		System.out.println("Original String=> "+str);
		printDuplicateChar(str);
	}

	private static void printDuplicateChar(String str) {
		Set<Character> set=new HashSet<>();
		for(char c: str.toCharArray()) {
			if(set.contains(c)) {
				System.out.println("Duplicate availabe for ==> "+c);
			}else {
				set.add(c);
			}
		}
	}
}
