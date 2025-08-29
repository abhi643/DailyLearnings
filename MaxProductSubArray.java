import java.util.*;

public class MaxProductSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];
        for(int i=1;i<size;i++){
            int tempMax = Math.max(arr[i], Math.max(maxProduct * arr[i], minProduct * arr[i]));
            minProduct = Math.min(arr[i], Math.min(maxProduct * arr[i], minProduct * arr[i]));
            maxProduct = tempMax;
            result = Math.max(result, maxProduct);
        }
        System.out.println(result);
    }
}
