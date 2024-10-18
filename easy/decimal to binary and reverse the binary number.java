import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        
        String binaryString = Integer.toBinaryString(decimal);
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
        int reversedDecimal = Integer.parseInt(reversedBinaryString, 2);
        
        System.out.println("Reversed binary in decimal: " + reversedDecimal);
        scanner.close();
    }
}
