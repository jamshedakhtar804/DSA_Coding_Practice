package msAccademyAssignment.dailyAssignment;

public class CountAdjacentRepeatedChar {

	public static void main(String[] args) {
		String str = "aabbccddeef";
		
		int countAdjacentRepeatChar=0;
		
		for(int i=0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				countAdjacentRepeatChar++;
				
				while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
					i++;
				}
			}
		}
		
		
		System.out.println("Number of Adjacent Character is ==> "+countAdjacentRepeatChar);

	}

}
