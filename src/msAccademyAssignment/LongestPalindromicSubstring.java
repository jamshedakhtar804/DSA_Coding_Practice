package msAccademyAssignment;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String str="ABRBADAADAB";
		
		System.out.println(longestPalindromicSubstring(str));
	}

	private static String longestPalindromicSubstring(String str) {
		if(str.length() <= 1) return str;
		
		String LPS="";
		for(int i=1; i<str.length(); i++) {
			//For Odd palindrome 
			int low=i;
			int high=i;
			while(str.charAt(low) == str.charAt(high)) {
				low--;
				high++;
				if(low == -1 || high == str.length()) {
					break;
				}
			}
		
			
			String palindrome=str.substring(low+1, high);
			if(palindrome.length() > LPS.length()) {
				LPS = palindrome;
			}
			
			//For Even palindrome
			low = i-1;
			high= i;
			while(str.charAt(low) == str.charAt(high)){
				low--;
				high++;
				if(low ==- 1 || high == str.length()) {
					break;
				}
			}
			palindrome=str.substring(low+1,high);
			if(palindrome.length() > LPS.length()) {
				LPS = palindrome;
			}
		}
		
		
		return LPS;
	}

}
