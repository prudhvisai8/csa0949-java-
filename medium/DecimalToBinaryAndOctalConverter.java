import java.util.Scanner;

public class DecimalToBinaryAndOctalConverter {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Decimal Number: ");
        String input = scanner.nextLine();
        
        try {
            double decimalNumber = Double.parseDouble(input);
            if (decimalNumber < 0 || decimalNumber % 1 != 0) {
                throw new NumberFormatException();
            }
            
            int intPart = (int) decimalNumber;
            String binaryNumber = Integer.toBinaryString(intPart);
            String octalNumber = Integer.toOctalString(intPart);

            System.out.println("Binary Number = " + binaryNumber);
            System.out.println("Octal = " + octalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid decimal integer.");
        }
        
        scanner.close();
    }
}
