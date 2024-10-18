import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the string: ");
            String str = scanner.nextLine();
            System.out.print("Enter the character to be searched: ");
            char ch = scanner.next().charAt(0);

            int index = -1;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    index = i;
                    break;
                }
            }

            if (index != -1)
                System.out.println(ch + " is found at index: " + index);
            else
                System.out.println(ch + " is not present in the string.");
        }
    }
}
