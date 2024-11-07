package msAccademyAssignment;

import java.util.HashSet;
import java.util.Set;

public class AllPermutationsOfString {

    // Method to print all permutations of the input string
    public static Set<String> getPermutations(String str) {
        Set<String> permutations = new HashSet<>();
        permute(str.toCharArray(), 0, permutations);
        return permutations;
    }

    // Recursive helper function to generate permutations
    private static void permute(char[] chars, int currentIndex, Set<String> permutations) {
        if (currentIndex == chars.length - 1) {
            permutations.add(new String(chars)); // Add current permutation to set
            return;
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i); // Swap currentIndex with i
            permute(chars, currentIndex + 1, permutations); // Recurse
            swap(chars, currentIndex, i); // Backtrack
        }
    }

    // Utility function to swap two characters in an array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String input = "JAM";
        Set<String> permutations = getPermutations(input);
        
        System.out.println("All permutations of \"" + input + "\":");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}
