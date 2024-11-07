package msAccademyAssignment;

import java.util.Scanner;

public class DecimalToBinary {
    public static String convertToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        
        return binary.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binary = convertToBinary(decimal);
        System.out.println("Binary representation: " + binary);
        
        scanner.close();
    }
}
