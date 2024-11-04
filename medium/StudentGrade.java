import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks in Python: ");
        int python = input.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        int cProgramming = input.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        int math = input.nextInt();
        System.out.print("Enter the marks in Physics: ");
        int physics = input.nextInt();
        int total = python + cProgramming + math + physics;
        double aggregate = total / 4.0;
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);
        if (aggregate >= 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
        input.close();
    }
}
