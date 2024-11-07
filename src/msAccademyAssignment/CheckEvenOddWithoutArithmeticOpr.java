package msAccademyAssignment;

import java.util.Scanner;

public class CheckEvenOddWithoutArithmeticOpr {
    public static void checkEvenOdd(int number) {
        // Check if the last bit is 0 or 1
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        int number = 55;
        
        checkEvenOdd(number);
       
    }
}
