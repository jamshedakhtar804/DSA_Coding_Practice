package msAccademyAssignment;

public class ReverseWordsInStringWithoutLibraryMethod {

    public static String reverseWords(String sentence) {
        // Step 1: Split the sentence into words without using split method
        StringBuilder reversedSentence = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = sentence.length() - 1; i >= 0; i--) {
            char ch = sentence.charAt(i);

            if (ch == ' ') {
                // Add the word and a space if it's not empty
                if (word.length() > 0) {
                    reversedSentence.append(word.reverse()).append(' ');
                    word.setLength(0); // Clear the word for the next one
                }
            } else {
                word.append(ch); // Build the word backwards
            }
        }

        // Add the last word (if any)
        if (word.length() > 0) {
            reversedSentence.append(word.reverse());
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence = "Hello World from Java";
        System.out.println("Original: " + sentence);
        System.out.println("Reversed words: " + reverseWords(sentence));
    }
}

