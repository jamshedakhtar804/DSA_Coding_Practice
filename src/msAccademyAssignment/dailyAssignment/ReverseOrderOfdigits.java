package msAccademyAssignment.dailyAssignment;

public class ReverseOrderOfdigits {

	public static void main(String[] args) {
		int digits=1456;
		int temp=digits;
		int sum=0;
		
		while(temp > 0) {
			int rem=temp%10;
			sum = sum*10 + rem;
			temp = temp/10;
		}
		
		System.out.println("Reversed digits==> "+sum);
	}

}
