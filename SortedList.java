import java.util.*;

/**
 * SortedList reads integers from user input, stores them in a LinkedList,
 * sorts the list in ascending order, and prints the sorted list.
 *
 * Author: Marisa Lavoratore
 * Date: June 2, 2025
 */
public class SortedList {

    /**
     * Main method that runs the program.
     * Reads integers until the user types 'done', sorts them, and displays the result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input, please enter an integer or 'done'.");
                }
            }
        }

        Collections.sort(numbers);

        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
