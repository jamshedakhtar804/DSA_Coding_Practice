package msAccademyAssignment;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		System.out.println("Number1=>"+num1+" and Number2=>"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;	
		
		System.out.println("Number1=>"+num1+" and Number2=>"+num2);
	}

}
