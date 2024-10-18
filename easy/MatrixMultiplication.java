import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows1 = 2, cols1 = 2, rows2 = 2, cols2 = 2;
            int[][] mat1 = new int[rows1][cols1];
            int[][] mat2 = new int[rows2][cols2];
            int[][] result = new int[rows1][cols2];
            System.out.println("Enter elements of Matrix 1:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    mat1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("Enter elements of Matrix 2:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    mat2[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols1; k++) {
                        result[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("Product of Matrices:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
