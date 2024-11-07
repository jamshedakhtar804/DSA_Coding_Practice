package msAccademyAssignment;

public class PalindromeCheckString {

	public static void main(String[] args) {
		
		String str="madam";
		boolean flag=checkPalindrome(str);
		System.out.println("Result is==> "+flag);
	}

	private static boolean checkPalindrome(String str) {
		boolean flag=true;
		int left=0;
		int right=str.length()-1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				flag=false;
			}
			left++;
			right--;
		}
		
		return flag;
	}

}
