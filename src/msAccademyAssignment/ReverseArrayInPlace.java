package msAccademyAssignment;

public class ReverseArrayInPlace {
	
	public static void main(String[] args) {
		int[] array = {1, 2, 10, 4, 5};

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        reverseArray(array);

        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
	}

	private static void reverseArray(int[] array) {
		int left =0;
		int right=array.length-1;
		
		while(left < right) {
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			
			left++;
			right--;
		}
	}

}
