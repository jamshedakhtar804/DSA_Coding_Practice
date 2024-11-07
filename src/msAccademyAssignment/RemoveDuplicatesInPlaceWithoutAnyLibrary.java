package msAccademyAssignment;

public class RemoveDuplicatesInPlaceWithoutAnyLibrary {

    public static int removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int newLength = n; // Start with the original length

        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (array[i] == array[j]) {
                    // Duplicate found, shift elements to the left
                    for (int k = j; k < newLength - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    newLength--; // Reduce length since duplicate is removed
                    j--; // Stay at the same j index for further comparison
                }
            }
        }

        return newLength;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 2, 3, 1};

        int length = removeDuplicates(array);

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
