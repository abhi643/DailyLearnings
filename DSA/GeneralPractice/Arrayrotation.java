import java.util.*;

public class Arrayrotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] originalArray = new int[n];
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();

        scanner.close();

        if (n == 0) {
            return;
        }

        int effectiveK = k % n;

        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + effectiveK) % n;
            rotatedArray[newIndex] = originalArray[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rotatedArray[i] + (i == n - 1 ? "" : " "));
        }
    }
}