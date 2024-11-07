package msAccademyAssignment;

import java.util.Scanner;

public class ArmstrongNumber {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number, remainder, result = 0, n = 0;
        
        // Find the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            n++;
        }
        
        originalNumber = number;
        
        // Check if the number is an Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }
        
        return result == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number =  153; //scanner.nextInt();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
