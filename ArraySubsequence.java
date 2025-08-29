import java.util.*;
public class ArraySubsequence {
    public static boolean isSubsequence(int[] main, int[] sub) {
        int i = 0, j = 0;
        while (i < main.length && j < sub.length) {
            if (main[i] == sub[j]) {
                j++;
            }
            i++;
        }
        return j == sub.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] mainArray = new int[n];
        for (int i = 0; i < n; i++) {
            mainArray[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] subArray = new int[m];
        for (int i = 0; i < m; i++) {
            subArray[i] = scan.nextInt();
        }
        
        boolean result = isSubsequence(mainArray, subArray);
        System.out.println(result ? "Yes" : "No");
    }
}
