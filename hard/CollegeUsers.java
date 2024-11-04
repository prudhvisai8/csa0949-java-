package hard;

import java.util.Scanner;

public class CollegeUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total number of users
        System.out.print("Enter the total number of users in the college: ");
        int totalUsers = scanner.nextInt();

        // Input total number of staff users
        System.out.print("Enter the number of staff users: ");
        int staffUsers = scanner.nextInt();

        // Ensure that staff users do not exceed total users
        if (staffUsers > totalUsers) {
            System.out.println("Invalid input: Staff users cannot exceed total users.");
        } else {
            // Calculate the number of non-teaching staff
            int nonTeachingStaff = staffUsers / 3;

            // Calculate the total number of staff including non-teaching staff
            int totalStaffUsers = staffUsers + nonTeachingStaff;

            // Calculate the number of student users
            int studentUsers = totalUsers - totalStaffUsers;

            // Output the result
            System.out.println("Total Staff Users (including Non-teaching): " + totalStaffUsers);
            System.out.println("Total Student Users: " + studentUsers);
        }

        scanner.close();
    }
}
