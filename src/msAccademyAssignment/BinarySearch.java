package msAccademyAssignment;

public class BinarySearch {
    // Iterative binary search function
    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            
            // If target greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                // If target is smaller, ignore right half
                right = mid - 1;
            }
        }
        
        // Target was not found
        return -1;
    }
    
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int result = bs.binarySearch(array, target);
        
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
