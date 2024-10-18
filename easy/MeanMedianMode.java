import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class MeanMedianMode {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];
            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            double mean = calculateMean(array);
            System.out.println("Mean = " + mean);
            double median = calculateMedian(array);
            System.out.println("Median = " + median);
            int mode = calculateMode(array);
            System.out.println("Mode = " + mode);
        }
    }
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static double calculateMedian(int[] array) {
        Arrays.sort(array);  
        int middle = array.length / 2;
        if (array.length % 2 == 0) {
            return (array[middle - 1] + array[middle]) / 2.0; 
        } else {
            return array[middle];  
        }
    }
    public static int calculateMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mode = array[0];
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;
    }
}
