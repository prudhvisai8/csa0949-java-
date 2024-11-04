package hard;

import java.util.Scanner;

public class PrimeNumbersAfterNth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nth prime number from user
        System.out.print("Enter the value of n (nth prime number): ");
        int nth = scanner.nextInt();

        // Input the number of primes to print after the nth prime
        System.out.print("Enter the number of primes to print after nth prime: ");
        int numPrimes = scanner.nextInt();

        // Find the nth prime number
        int nthPrime = findNthPrime(nth);

        System.out.println("The " + nth + "th prime number is: " + nthPrime);

        // Print n prime numbers after nth prime
        System.out.println("Next " + numPrimes + " prime numbers after " + nthPrime + " are: ");
        printPrimesAfter(nthPrime, numPrimes);

        scanner.close();
    }

    // Function to find the nth prime number
    public static int findNthPrime(int nth) {
        int count = 0;
        int num = 2;

        while (count < nth) {
            if (isPrime(num)) {
                count++;
            }
            if (count < nth) {
                num++;
            }
        }
        return num;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print n prime numbers after a given prime
    public static void printPrimesAfter(int startPrime, int numPrimes) {
        int count = 0;
        int num = startPrime + 1;

        while (count < numPrimes) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }
}
