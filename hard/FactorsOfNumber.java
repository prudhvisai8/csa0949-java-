package hard;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get the nth factor position from the user
        System.out.print("Enter the nth factor to find: ");
        int n = scanner.nextInt();

        // Calculate and print all factors of the number
        System.out.println("Factors of " + number + " are: ");
        int count = 0;
        int nthFactor = -1; // Initialize to -1 in case nth factor doesn't exist

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                System.out.print(i + " ");
                // Check if current factor is the nth factor
                if (count == n) {
                    nthFactor = i;
                }
            }
        }

        // Print total number of factors
        System.out.println("\nTotal number of factors: " + count);

        // Print nth factor if it exists, otherwise show an error
        if (nthFactor != -1) {
            System.out.println("The " + n + "th factor is: " + nthFactor);
        } else {
            System.out.println("The number doesn't have " + n + " factors.");
        }

        scanner.close();
    }
}
