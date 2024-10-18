import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MergeSortedArrays {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the first array: ");
            int size1 = scanner.nextInt();
            int[] arr1 = new int[size1];
            System.out.println("Enter " + size1 + " elements for the first sorted array:");
            for (int i = 0; i < size1; i++) {
                arr1[i] = scanner.nextInt();
            }
            System.out.print("Enter the size of the second array: ");
            int size2 = scanner.nextInt();
            int[] arr2 = new int[size2];
            System.out.println("Enter " + size2 + " elements for the second sorted array:");
            for (int i = 0; i < size2; i++) {
                arr2[i] = scanner.nextInt();
            }
            ArrayList<Integer> mergedList = new ArrayList<>();
            for (int i : arr1) {
                mergedList.add(i);
            }
            for (int i : arr2) {
                mergedList.add(i);
            }
            Collections.sort(mergedList);
            System.out.println("Merged and Sorted Array:");
            for (int num : mergedList) {
                System.out.print(num + " ");
            }
        }
    }
}
