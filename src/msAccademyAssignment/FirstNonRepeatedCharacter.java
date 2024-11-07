package msAccademyAssignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static Character findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No non-repeated character found
    }

    public static void main(String[] args) {
        String str = "swiss";
        Character firstNonRepeated = findFirstNonRepeatedCharacter(str);

        if (firstNonRepeated != null) {
            System.out.println("The first non-repeated character is: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

