import java.util.*;

public class SimpleNameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'done' to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) {
                break;
            }
            names.add(name);
        }

        System.out.print("Order (A/D): ");
        String order = scanner.nextLine();

        if (order.equalsIgnoreCase("A")) {
            Collections.sort(names);
        } else if (order.equalsIgnoreCase("D")) {
            Collections.sort(names, Collections.reverseOrder());
        }

        System.out.println("Sorted names: " + names);
        scanner.close();
    }
}
