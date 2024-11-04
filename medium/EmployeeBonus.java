import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the grade of the employee (A/B): ");
            char grade = scanner.next().charAt(0);
 
            if (grade != 'A' && grade != 'B' && grade != 'a' && grade != 'b') {
                System.out.println("Invalid grade entered. Please enter either 'A' or 'B'.");
                return;
            }

            System.out.print("Enter the employee salary: ");
            if (!scanner.hasNextDouble()) { 
                System.out.println("Invalid salary entered. Please enter a valid number for salary.");
                return;
            }

            double salary = scanner.nextDouble();

            if (salary < 0) {
                System.out.println("Salary cannot be negative.");
                return;
            }

            if (salary == 0) {
                System.out.println("Salary cannot be zero.");
                return;
            }

            double bonus = 0;
            if (grade == 'A' || grade == 'a') {
                bonus = 0.05 * salary;
            } else if (grade == 'B' || grade == 'b') {
                bonus = 0.10 * salary;
            }

            if (salary < 10000) {
                bonus += 0.02 * salary;
            }

            double totalSalary = salary + bonus;

            System.out.println("Salary = " + salary);
            System.out.println("Bonus = " + bonus);
            System.out.println("Total to be paid: " + totalSalary);
        }
    }
}
