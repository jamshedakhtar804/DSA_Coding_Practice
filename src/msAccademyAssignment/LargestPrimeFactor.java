package msAccademyAssignment;

public class LargestPrimeFactor {
    public static int largestPrimeFactor(int number) {
        int largestPrime = -1;
        
        // Check for number of 2s in number
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }
        
        // Check for odd factors
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }
        
        // If number is a prime number greater than 2
        if (number > 2) {
            largestPrime = number;
        }
        
        return largestPrime;
    }
    
    public static void main(String[] args) {
        int number = 315;
        int largestPrime = largestPrimeFactor(number);
        System.out.println("Largest prime factor of " + number + " is: " + largestPrime);
    }
}
