import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();

        // By default, PriorityQueue is a min-heap.
        // We use Collections.reverseOrder() to make it a max-heap,
        // so the largest element is always at the top.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < Q; i++) {
            String command = scanner.next();

            switch (command) {
                case "add": {
                    int x = scanner.nextInt();
                    pq.add(x);
                    break;
                }
                case "remove": {
                    // poll() safely removes the top element,
                    // or does nothing if the queue is empty.
                    pq.poll();
                    break;
                }
                case "print": {
                    // peek() gets the top element without removing it.
                    // It returns null if the queue is empty.
                    Integer top = pq.peek();
                    System.out.println(top != null ? top : 0);
                    break;
                }
            }
        }
        scanner.close();
    }
}