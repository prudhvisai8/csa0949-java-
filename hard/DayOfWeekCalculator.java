package hard;

import java.util.Scanner;

public class DayOfWeekCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        if (totalDays < 0) {
            System.out.println("Invalid input. Days cannot be negative.");
        } else {
            // Constants for days in a year and week
            final int DAYS_IN_YEAR = 365;
            final int DAYS_IN_WEEK = 7;

            // Calculate the number of years
            int years = totalDays / DAYS_IN_YEAR;

            // Calculate the remaining days after subtracting years
            int remainingDays = totalDays % DAYS_IN_YEAR;

            // Calculate the number of weeks
            int weeks = remainingDays / DAYS_IN_WEEK;

            // Calculate the remaining days after subtracting weeks
            int days = remainingDays % DAYS_IN_WEEK;

            // Output the result
            System.out.println("Equivalent duration:");
            System.out.println("Years: " + years);
            System.out.println("Weeks: " + weeks);
            System.out.println("Days: " + days);
        }

        scanner.close();
    }
}
