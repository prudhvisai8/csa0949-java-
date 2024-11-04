import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Total Users: ");
        int totalUsers = sc.nextInt();
        System.out.print("Enter Staff Users: ");
        int staffUsers = sc.nextInt();
        
        if (totalUsers < 0 || staffUsers < 0) {
            System.out.println("Invalid input. Values cannot be negative.");
        } else if (staffUsers > totalUsers) {
            System.out.println("Staff users cannot exceed total users.");
        } else {
            int studentUsers = totalUsers - staffUsers;
            System.out.println("Student Users: " + studentUsers);
        }
        
        sc.close();
    }
}
