package msAccademyAssignment;

import java.util.HashSet;
import java.util.Set;

public class IsCommonSubstring {
	public static void main(String[] args) {
		String[] a= {"ab","cd","ef"};
		String[] b= {"af","ee","ef"};
		
		for(int i=0; i<a.length; i++) {
			if(isSubString(a[i], b[i])) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

	private static boolean isSubString(String a, String b) {
		Set<Character> set=new HashSet<>();
		
		for(char c: a.toCharArray()) {
			set.add(c);
		}
		
		for(char c: b.toCharArray()) {
			if(set.contains(c)) {
				return true;
			}
		}
		
		
		return false;
	}
}
