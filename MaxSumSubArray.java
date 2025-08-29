import java.util.Scanner;

//Kadane's Algorithm for Maximum Sum Subarray
public class MaxSumSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();   
        }
        int currentMax = arr[0];
        int sumOfMax = arr[0];
        for (int i = 1; i < size; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            sumOfMax = Math.max(sumOfMax, currentMax);
        }
        System.out.println(sumOfMax);
    }
}
