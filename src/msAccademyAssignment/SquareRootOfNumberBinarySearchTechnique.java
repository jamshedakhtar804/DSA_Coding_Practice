package msAccademyAssignment;

import java.util.Scanner;

public class SquareRootOfNumberBinarySearchTechnique {
    public static double calculateSquareRoot(double number) {
        double left = 0;
        double right = number;
        double epsilon = 1e-7; // Desired precision

        while (right - left > epsilon) {
            double mid = (left + right) / 2;
            double midSquared = mid * mid;

            if (midSquared == number) {
                return mid;
            } else if (midSquared < number) {
                left = mid;
            } else {
                right = mid;
            }
        }
        
        return (left + right) / 2;
    }

    public static void main(String[] args) {
        double number = 10;
        
        double squareRoot = calculateSquareRoot(number);
        System.out.println("The square root of " + number + " is: " + squareRoot);
    }
}
