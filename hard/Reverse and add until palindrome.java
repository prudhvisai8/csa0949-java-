import java.util.Scanner;

public class ReverseAndAddPalindrome {

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    public static void reverseAndAdd(int num) {
        if (num < 0) {
            System.out.println("Invalid input for negative numbers.");
            return;
        }

        int rev = reverseNumber(num);
        while (!isPalindrome(num)) {
            System.out.println(num + " + " + rev + " = " + (num + rev));
            num = num + rev;
            rev = reverseNumber(num);
        }
        System.out.println("Palindrome: " + num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        reverseAndAdd(num);
        sc.close();
    }
}
