import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt(); // Read the number of queries

        // ArrayDeque is an efficient implementation of the Deque interface.
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < Q; i++) {
            String command = scanner.next();

            switch (command) {
                case "insertback": {
                    int x = scanner.nextInt();
                    deque.addLast(x);
                    break;
                }
                case "eraseback": {
                    // pollLast() safely removes the last element, or does nothing if empty.
                    deque.pollLast();
                    break;
                }
                case "insertfront": {
                    int x = scanner.nextInt();
                    deque.addFirst(x);
                    break;
                }
                case "erasefront": {
                    // pollFirst() safely removes the first element, or does nothing if empty.
                    deque.pollFirst();
                    break;
                }
                case "printfront": {
                    // peekFirst() gets the first element without removing it.
                    // It returns null if the deque is empty.
                    Integer front = deque.peekFirst();
                    System.out.println(front != null ? front : 0);
                    break;
                }
                case "printback": {
                    // peekLast() gets the last element without removing it.
                    Integer back = deque.peekLast();
                    System.out.println(back != null ? back : 0);
                    break;
                }
                case "print": {
                    int index = scanner.nextInt();
                    // Check if the index is within the bounds of the deque's size.
                    if (index >= 0 && index < deque.size()) {
                        // Deque doesn't have a .get(index) method, so we convert it to an array.
                        Integer[] arr = deque.toArray(new Integer[0]);
                        System.out.println(arr[index]);
                    } else {
                        // If out of bounds, print 0.
                        System.out.println(0);
                    }
                    break;
                }
            }
        }
        scanner.close();
    }
}