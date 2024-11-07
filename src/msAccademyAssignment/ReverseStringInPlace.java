package msAccademyAssignment;

public class ReverseStringInPlace {

	public static void main(String[] args) {
		String str="Jamshed";
		char[] charArr=str.toCharArray();
		int low=0;
		int high=charArr.length-1;
		
		while(low < high) {
			char temp=charArr[low];
			charArr[low]=charArr[high];
			charArr[high]=temp;
			
			low++;
			high--;
		}
		String rstr=new String(charArr);
		System.out.println("Reversed String is===> "+rstr);
	}

}
