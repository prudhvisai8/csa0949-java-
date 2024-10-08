import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if a string is a palindrome
    public static boolean isStringPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Function to check if a number is a palindrome
    public static boolean isNumberPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying menu options to the user
        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Check if a number is a palindrome");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Case for checking string palindrome
                System.out.print("Enter a string: ");
                scanner.nextLine();  // consume the newline character after nextInt()
                String str = scanner.nextLine();
                if (isStringPalindrome(str)) {
                    System.out.println("The string is a palindrome.");
                } else {
                    System.out.println("The string is not a palindrome.");
                }
                break;

            case 2:
                // Case for checking number palindrome
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                if (isNumberPalindrome(num)) {
                    System.out.println("The number is a palindrome.");
                } else {
                    System.out.println("The number is not a palindrome.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
                break;
        }

        scanner.close();
    }
}
