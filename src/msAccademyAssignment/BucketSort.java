package msAccademyAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // Step 1: Create empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 2: Distribute elements into buckets based on a hashing function
        for (float element : arr) {
            int bucketIndex = (int) (element * n); // Multiplying by n to scale into index range
            buckets[bucketIndex].add(element);
        }

        // Step 3: Sort each bucket individually
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Step 4: Concatenate all buckets into the original array
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float element : bucket) {
                arr[index++] = element;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.25f, 0.36f, 0.58f, 0.41f, 0.29f, 0.22f, 0.75f, 0.49f};
        System.out.println("Original Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }

        bucketSort(arr);

        System.out.println("\nSorted Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
