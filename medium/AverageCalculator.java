import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveSum = 0, positiveCount = 0;
        int negativeSum = 0, negativeCount = 0;
        int number;
        System.out.println("Enter -1 to exit...");
        while (true) {
            System.out.print("Enter the number: ");
            number = input.nextInt();

            if (number == -1) {
                break; 
            }
            if (number > 0) {
                positiveSum += number;
                positiveCount++;
            } else if (number < 0) {
                negativeSum += number;
                negativeCount++;
            }
        }
        double positiveAvg = (positiveCount > 0) ? (double) positiveSum / positiveCount : 0;
        double negativeAvg = (negativeCount > 0) ? (double) negativeSum / negativeCount : 0;
        System.out.println("The average of negative numbers is: " + negativeAvg);
        System.out.println("The average of positive numbers is: " + positiveAvg);
        input.close();
    }
}
