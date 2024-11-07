package msAccademyAssignment;

public class CheckTwoStringRotation {

	public static void main(String[] args) {
		
		System.out.println("Both strings are rotation of each other is===> "+areRotation("ABCD","CDAB"));
	}

	private static boolean areRotation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		String concotenated=s1+s1;
		return concotenated.contains(s2);
	}

}
