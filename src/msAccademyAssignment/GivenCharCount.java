package msAccademyAssignment;

public class GivenCharCount {

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "hello world";
        char target = 'o';

        int occurrences = countOccurrences(str, target);
        System.out.println("Occurrences of '" + target + "' in the string: " + occurrences);
    }
}
