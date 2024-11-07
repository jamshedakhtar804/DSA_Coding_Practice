package msAccademyAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberSieveOfEratosthenesAlgo {
    public static void printPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");
        printPrimes(n);
        
        scanner.close();
    }
}

