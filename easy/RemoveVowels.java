import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String result = input.replaceAll("[aeiouAEIOU]", "");
            System.out.println("The string without vowels is: " + result);
        }
    }
}
