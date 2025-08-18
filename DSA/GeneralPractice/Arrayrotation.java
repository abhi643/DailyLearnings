import java.util.*;

public class Arrayrotation {
    public static void main(String[] args) {
        // Your code starts here
        Scanner scanner = new Scanner(System.in);

        // 1. Read input
        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        scanner.close();

        // If the array is empty or has one element, no rotation is needed.
        if (n == 0) {
            return;
        }

        // 2. Calculate effective rotations
        // This avoids unnecessary full rotations (e.g., rotating a 5-element array 7 times is the same as rotating it 2 times)
        int effectiveK = k % n;

        // 3. Use an extra array to store the rotated result
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            // Calculate the new index for the element currently at index 'i'
            int newIndex = (i + effectiveK) % n;
            rotatedArray[newIndex] = originalArray[i];
        }

        // 4. Print the final rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + (i == n - 1 ? "" : " "));
        }
    }
}