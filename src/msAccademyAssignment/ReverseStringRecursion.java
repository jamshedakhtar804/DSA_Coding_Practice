package msAccademyAssignment;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String str="abcdef";
		
		reverseString(0, str);
	}

	private static void reverseString(int i,String str) {
	
		if(i < str.length()) {
			reverseString(i+1,str);
			System.out.print(str.charAt(i));
		}
	}

}
