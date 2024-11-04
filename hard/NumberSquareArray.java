package hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSquareArray {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower range: ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter the upper range: ");
        int upperRange = sc.nextInt();

        if (lowerRange > upperRange) {
            System.out.println("Invalid range. Lower range cannot be greater than upper range.");
            return;
        }

        List<String> numberSquareList = new ArrayList<>();

        for (int i = lowerRange; i <= upperRange; i++) {
            numberSquareList.add("(" + i + ", " + (i * i) + ")");
        }

        System.out.println(numberSquareList);
        sc.close();
    }
}
