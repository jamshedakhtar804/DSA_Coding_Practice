package msAccademyAssignment;

public class CheckOnlyDigitsInString {

	public static void main(String[] args) {
		String str="1234";
		
		if(str.matches("\\d+")) {
			System.out.println("String has only digits.");
		}else {
			System.out.println("String is having other than digits.");
		}
	}

}
