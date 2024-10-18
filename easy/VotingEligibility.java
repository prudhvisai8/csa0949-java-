import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        
        try {
            double age = scanner.nextDouble();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else if (age > 0) {
                int yearsLeft = 18 - (int) age;
                System.out.println("You are allowed to vote after " + yearsLeft + " years");
            } else {
                System.out.println("Invalid age entered.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        
        scanner.close();
    }
}
