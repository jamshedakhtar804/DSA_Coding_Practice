package msAccademyAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSortForIntegers {

    public static void bucketSort(int[] arr, int bucketCount) {
        if (arr.length == 0) return;

        // Step 1: Find the maximum and minimum values in the array
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int num : arr) {
            if (num < minValue) minValue = num;
            if (num > maxValue) maxValue = num;
        }

        // Step 2: Create buckets
        int range = (maxValue - minValue) / bucketCount + 1;
        ArrayList<Integer>[] buckets = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Distribute elements into buckets
        for (int num : arr) {
            int bucketIndex = (num - minValue) / range;
            buckets[bucketIndex].add(num);
        }

        // Step 4: Sort each bucket individually
        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Step 5: Concatenate all buckets into the original array
        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {54, 46, 83, 66, 95, 92, 43, 78, 36, 50};
        int bucketCount = 5; // Define the number of buckets as per your needs
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bucketSort(arr, bucketCount);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

