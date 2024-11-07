package msAccademyAssignment;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicatesInPlace {

    public static int removeDuplicates(int[] array) {
    	
    	//Arrays.sort(array); if array is unsorted
        if (array.length == 0) return 0;

        int j = 0; // Pointer to place unique elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[j]) {
                j++;
                array[j] = array[i];
            }
        }
        return j + 1; // Length of array with unique elements
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4, 5};
        
        int length = removeDuplicates(array);

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

