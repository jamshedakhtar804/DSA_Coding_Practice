package msAccademyAssignment;

public class VowelConsonentsCounter {

    public static void countVowelsAndConsonants(String input) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countVowelsAndConsonants(input);
    }
}
