package msAccademyAssignment;

public class PrimeFactorsOfGivenNumber {
    public static void printPrimeFactors(int number) {
        // Start with the smallest prime factor
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
    
    public static void main(String[] args) {
        int number = 315;
        System.out.print("Prime factors of " + number + " are: ");
        printPrimeFactors(number);
    }
}

