import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }
            
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
                return;
            }
            
            System.out.print("First " + n + " perfect numbers are: ");
            
            int count = 0;
            int number = 1;
            
            while (count < n) {
                if (isPerfect(number)) {
                    System.out.print(number);
                    count++;
                    if (count < n) {
                        System.out.print(" , ");
                    }
                }
                number++;
            }
        }
    }

    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num && num != 0;
    }
}
