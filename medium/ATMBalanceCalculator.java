import java.util.Scanner;

public class ATMBalanceCalculator {

    // Function to calculate the total balance in the ATM
    public static int calculateTotalBalance(int d1, int n1, int d2, int n2, int d3, int n3, int d4, int n4) {
        return (d1 * n1) + (d2 * n2) + (d3 * n3) + (d4 * n4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs from the user for each denomination and corresponding notes
        System.out.print("Enter the 1st Denomination: ");
        int denomination1 = scanner.nextInt();
        System.out.print("Enter the 1st Denomination number of notes: ");
        int notes1 = scanner.nextInt();

        System.out.print("Enter the 2nd Denomination: ");
        int denomination2 = scanner.nextInt();
        System.out.print("Enter the 2nd Denomination number of notes: ");
        int notes2 = scanner.nextInt();

        System.out.print("Enter the 3rd Denomination: ");
        int denomination3 = scanner.nextInt();
        System.out.print("Enter the 3rd Denomination number of notes: ");
        int notes3 = scanner.nextInt();

        System.out.print("Enter the 4th Denomination: ");
        int denomination4 = scanner.nextInt();
        System.out.print("Enter the 4th Denomination number of notes: ");
        int notes4 = scanner.nextInt();

        // Calculating the total available balance
        int totalBalance = calculateTotalBalance(denomination1, notes1, denomination2, notes2, denomination3, notes3, denomination4, notes4);

        // Displaying the total available balance
        System.out.println("Total Available Balance in ATM: " + totalBalance);

        scanner.close();
    }
}
